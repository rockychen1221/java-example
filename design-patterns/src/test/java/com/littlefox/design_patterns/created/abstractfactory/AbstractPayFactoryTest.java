package com.littlefox.design_patterns.created.abstractfactory;

import com.littlefox.design_patterns.created.abstractfactory.enums.PayEnums;

public class AbstractPayFactoryTest {
    public static void main(String[] args) {
        AbstractPayFactory nfcAbstractPayFactory = new NFCAbstractPayFactory();
        Pay applePay = nfcAbstractPayFactory.createPay(PayEnums.ApplePay);
        applePay.payment();
        applePay.payMethod();

        AbstractPayFactory qrCodeAbstractPayFactory = new QRCodeAbstractPayFactory();
        Pay aliPay = qrCodeAbstractPayFactory.createPay(PayEnums.AliPay);
        aliPay.payMethod();
        aliPay.payment();
    }
}
