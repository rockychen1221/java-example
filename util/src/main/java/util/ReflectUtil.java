package util;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

public class ReflectUtil {
    /**
     * 获取类所有声明的字段，即包括public、private和proteced，以及父类的字段属性
     * 静态内部类适用（不适用于非静态内部类）包括hutool 会产生this$0
     * @param c
     * @return
     */
    public static Field[] getAllFields(Class<?> c){
        Assert.notNull(c);
        Field[] fields= null;
        // 获取父类，判断是否为实体类
        if (c.getSuperclass() != Object.class) {
            fields =getAllFields(c.getSuperclass());
        }
        // 获取类中的所有定义字段
        Field[] declaredfields = c.getDeclaredFields();
        return ArrayUtils.addAll(fields, declaredfields);
    }

    /**
     * @param src  用于赋值的实体类
     * @param dest 需要待赋值的实体类
     */
    public static void copyAttrValue(Object src, Object dest) {
        Assert.notNull(src);
        Assert.notNull(dest);
        Class srcClazz = src.getClass();
        Class destClazz = dest.getClass();
        Field[] srcFields = getAllFields(srcClazz);
        Field[] destFields = getAllFields(destClazz);
        for (Field srcField : srcFields) {
            for (Field destField : destFields) {
                if (srcField.getName().equals(destField.getName())) {
                    Object value = invokeGetMethod(src,srcField.getName());
                    invokeSetMethod(dest,destField.getName(),value);
                }
            }
        }
    }

    /**
     * 判断字段类型是否是Java数据类型
     * @param clz
     * @return
     */
    public static boolean isJavaClass(Class<?> clz) {
        return clz != null && clz.getClassLoader() == null;
    }

    /**
     * 执行某个类的具体Field的 set方法
     * @param clazz 类实例
     * @param fieldName 字段名
     * @param args 赋值参数（适用set）
     * @return
     */
    public static Object invokeSetMethod(Object clazz, String fieldName,Object... args) {
        Assert.notNull(clazz);
        Assert.notEmpty(fieldName);
        return cn.hutool.core.util.ReflectUtil.invoke(clazz, StrUtil.genSetter(fieldName) ,args);
    }

    /**
     * 执行某个类的具体Field的 get方法
     * @param clazz 类实例
     * @param fieldName 字段名
     * @return
     */
    public static Object invokeGetMethod(Object clazz, String fieldName) {
        Assert.notNull(clazz);
        Assert.notEmpty(fieldName);
        return cn.hutool.core.util.ReflectUtil.invoke(clazz, StrUtil.genGetter(fieldName));
    }

}