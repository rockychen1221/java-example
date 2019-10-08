package com.littlefox.design_patterns.created.abstractfactory;

import com.littlefox.design_patterns.created.abstractfactory.enums.PayEnums;

public class NFCAbstractPayFactory extends AbstractPayFactory {

    @Override
    public Pay createPay() {
        return super.createPay(PayEnums.ApplePay);
    }
}
