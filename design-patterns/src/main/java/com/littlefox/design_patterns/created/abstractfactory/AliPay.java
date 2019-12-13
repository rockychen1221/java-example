package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:22
 * 支付宝
 */
public class AliPay extends QRCodeAbstractPay {

    @Override
    public void payment() {
        System.out.println("欢迎使用AliPay付款");
    }

}
