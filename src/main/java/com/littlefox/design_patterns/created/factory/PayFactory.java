package com.littlefox.design_patterns.created.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * 支付工厂
 */
public class PayFactory {

    public static Pay createPay (Class c) {
        Pay pay = null;
        try {
             pay=(Pay) c.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return pay;
    }
}