package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 15:22
 */
public abstract class NFCAbstractPay implements Pay {

    @Override
    public void payMethod() {
        System.out.println("基于NFC硬件支持的移动支付");
    }
}
