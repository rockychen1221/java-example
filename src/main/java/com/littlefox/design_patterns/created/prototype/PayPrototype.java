package com.littlefox.design_patterns.created.prototype;

public class PayPrototype implements Pay {

    private Pay pay;

    //默认代理NFC支付
    public PayPrototype (){
        this.pay = new NFCPay();
    }

    //可以是任何Pay类型的代理
    public PayPrototype (Pay pay){
        this.pay = pay;
    }

    /**
     * 由被代理的对象完成具体操作
     */
    @Override
    public void payment() {
        this.pay.payment();
    }
}
