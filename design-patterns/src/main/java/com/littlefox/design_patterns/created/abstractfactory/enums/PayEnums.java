package com.littlefox.design_patterns.created.abstractfactory.enums;


/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 15:40
 */
public enum PayEnums {

    ApplePay("com.littlefox.design_patterns.created.abstractfactory.ApplePay"),
    HuaweiPay("com.littlefox.design_patterns.created.abstractfactory.HuaweiPay"),
    MeizuPay("com.littlefox.design_patterns.created.abstractfactory.MeizuPay"),
    MiPay("com.littlefox.design_patterns.created.abstractfactory.MiPay"),
    OPPOPay("com.littlefox.design_patterns.created.abstractfactory.OPPOPay"),
    SamsungPay("com.littlefox.design_patterns.created.abstractfactory.SamsungPay"),
    viviPay("com.littlefox.design_patterns.created.abstractfactory.viviPay"),

    AliPay("com.littlefox.design_patterns.created.abstractfactory.AliPay"),
    UnionPay("com.littlefox.design_patterns.created.abstractfactory.UnionPay"),
    WeChatPay("com.littlefox.design_patterns.created.abstractfactory.WeChatPay");

    private String value = "";

    private PayEnums(String value){
        this.value =value;
    }

    public String getValue(){ return this.value; }

}
