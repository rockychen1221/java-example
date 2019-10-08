package com.littlefox.design_patterns.action.strategy;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:22
 * AliPay
 */
public class AliPay implements Pay {
    @Override
    public void activity() {
        System.out.println("AliPay 支付宝1212当天5折");
    }

}
