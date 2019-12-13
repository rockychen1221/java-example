package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:23
 */
public class UnionPay extends QRCodeAbstractPay {

    @Override
    public void payment() {
        System.out.println("欢迎使用UnionPay付款");
    }
}
