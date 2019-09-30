package com.littlefox.design_patterns.created.factory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:22
 * 支付宝
 */
public class AliPay implements Pay {

    @Override
    public void transfer() {
        System.out.println("欢迎使用支付宝转账");
    }

    @Override
    public void receipt() {
        System.out.println("欢迎使用支付宝收款");
    }

    @Override
    public void payment() {
        System.out.println("欢迎使用支付宝付款");
    }
}
