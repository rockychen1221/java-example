package utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtils {

    /**
     * @param src  用于赋值的实体类
     * @param dest 需要待赋值的实体类
     */
    public static void copyAttrValue(Object src, Object dest) {
        Class srcClazz = src.getClass();
        Class destClazz = dest.getClass();
        Field[] srcFields = srcClazz.getDeclaredFields();
        Field[] destFields = destClazz.getDeclaredFields();
        for (Field srcField : srcFields) {
            for (Field destField : destFields) {
                if (srcField.getName().equals(destField.getName())) {
                    Object[] obj = new Object[1];
                    obj[0] = ReflectUtils.invokeGetMethod(src, srcField.getName(), null);
                    ReflectUtils.invokeSetMethod(dest, destField.getName(), obj);
                }
            }
        }
    }

    /**
     * 执行某个Field的getField方法
     *
     * @param clazz     类
     * @param fieldName 类的属性名称
     * @param args      参数，默认为null
     * @return
     */
    public static Object invokeGetMethod(Object clazz, String fieldName, Object[] args) {
        String methodName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        Method method = null;
        try {
            method = clazz.getClass().getDeclaredMethod("get" + methodName);
            return method.invoke(clazz);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 执行某个Field的setField方法
     *
     * @param clazz     类
     * @param fieldName 类的属性名称
     * @param args      参数，默认为null
     * @return
     */
    public static Object invokeSetMethod(Object clazz, String fieldName, Object[] args) {
        String methodName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        Method method = null;
        try {
            Class[] parameterTypes = new Class[1];
            Class c = clazz.getClass();
            Field field = c.getDeclaredField(fieldName);
            parameterTypes[0] = field.getType();
            method = c.getDeclaredMethod("set" + methodName, parameterTypes);
            return method.invoke(clazz, args);
        } catch (Exception e) {
            return "";
        }
    }
}