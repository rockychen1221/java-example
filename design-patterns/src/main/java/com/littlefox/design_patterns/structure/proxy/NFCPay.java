package com.littlefox.design_patterns.structure.proxy;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-08 15:44
 */
public class NFCPay implements Pay {

    @Override
    public void payment() {
        System.out.println("使用基于NFC近距离无线通讯技术进行支付");
    }
}
