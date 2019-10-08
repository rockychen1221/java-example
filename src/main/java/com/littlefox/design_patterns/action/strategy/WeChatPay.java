package com.littlefox.design_patterns.action.strategy;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:24
 */
public class WeChatPay implements Pay {
    @Override
    public void activity() {
        System.out.println("微信支付启动88智慧生活日 8月8日全国范围推出免单活动");
    }
}
