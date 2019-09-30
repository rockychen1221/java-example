package com.littlefox.design_patterns.created.factory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:40
 */
public class PayFactoryTest {

    public static void main(String[] args) {

        Pay alipay = PayFactory.createPay(AliPay.class);
        alipay.transfer();
        alipay.payment();
        alipay.receipt();

        Pay unionpay = PayFactory.createPay(UnionPay.class);
        unionpay.transfer();
        unionpay.payment();
        unionpay.receipt();

        Pay wechatpay = PayFactory.createPay(WeChatPay.class);
        wechatpay.transfer();
        wechatpay.payment();
        wechatpay.receipt();

    }

}