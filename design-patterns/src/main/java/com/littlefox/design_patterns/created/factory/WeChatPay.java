package com.littlefox.design_patterns.created.factory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:24
 */
public class WeChatPay implements Pay {

    @Override
    public void transfer() {
        System.out.println("欢迎使用WeChatPay转账");
    }

    @Override
    public void receipt() {
        System.out.println("欢迎使用WeChatPay收款");
    }

    @Override
    public void payment() {
        System.out.println("欢迎使用WeChatPay付款");
    }
}
