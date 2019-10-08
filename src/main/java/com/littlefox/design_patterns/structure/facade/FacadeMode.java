package com.littlefox.design_patterns.structure.facade;

public class FacadeMode {

    private Transfer aliPay = new AliPayImpl();

    public void transfer(String cardId , double money){
        aliPay.cardId(cardId);
        aliPay.money(money);
        aliPay.notice();
    }

}
