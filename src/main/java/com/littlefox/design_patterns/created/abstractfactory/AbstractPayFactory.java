package com.littlefox.design_patterns.created.abstractfactory;

import com.littlefox.design_patterns.created.abstractfactory.enums.PayEnums;

import java.lang.reflect.InvocationTargetException;

/**
 * 抽象Pay工厂
 */
public abstract class AbstractPayFactory implements PayFactory {

    public Pay createPay (PayEnums payEnums) {
        Pay pay = null;
        if (payEnums.getValue().equals("")) {
            return pay;
        }
        try {
            pay = (Pay) Class.forName(payEnums.getValue()).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pay;
    }
}