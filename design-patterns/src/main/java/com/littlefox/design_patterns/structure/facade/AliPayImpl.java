package com.littlefox.design_patterns.structure.facade;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-08 17:02
 */
public class AliPayImpl implements Transfer {

    @Override
    public void cardId(String cardId) {
        System.out.println("收款方卡号: "+cardId);
    }

    @Override
    public void money(double money) {
        System.out.println("转账金额: "+money);
    }

    @Override
    public void notice() {
        System.out.println("发送回执、通知");
    }
}
