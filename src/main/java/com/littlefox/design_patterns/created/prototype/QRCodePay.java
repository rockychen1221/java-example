package com.littlefox.design_patterns.created.prototype;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-08 15:42
 */
public class QRCodePay implements Pay{
    @Override
    public void payment() {
        System.out.println("使用基于二维码技术支付");
    }
}
