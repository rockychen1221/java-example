package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 15:20
 */
public abstract class QRCodeAbstractPay implements Pay {
    @Override
    public void payMethod() {
        System.out.println("基于QRCode软件支持的移动支付");
    }
}
