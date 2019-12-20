package util;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

public class ReflectUtil {
    /**
     * 获取类所有字段
     * @param c
     * @return
     */
    public static Field[] getAllFields(Class<?> c){
        Field[] fields= null;
        // 获取父类，判断是否为实体类
        if (c.getSuperclass() != Object.class) {
            fields =getAllFields(c.getSuperclass());
        }
        // 获取类中的所有定义字段
        Field[] declaredfields = c.getDeclaredFields();
        return ArrayUtils.addAll(fields,declaredfields);
    }

    /**
     * 复制属性
     * @param source 源
     * @param target 目标
     */
    public static void copyAttrValue(Object source, Object target) {
        Class sourceClazz = source.getClass();
        Class targetClazz = target.getClass();
        Field[] sourceFields = getAllFields(sourceClazz);
        Field[] targetFields = getAllFields(targetClazz);
        try{
            for (Field sourceField : sourceFields) {
                sourceField.setAccessible(true);
                for (Field targetField : targetFields) {
                    targetField.setAccessible(true);
                    if (StringUtils.equals(sourceField.getName(),targetField.getName())) {
                        targetField.set(target,sourceField.get(source));
                    }
                }
            }
        }catch (IllegalAccessException e){
            throw new RuntimeException(e);
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

}