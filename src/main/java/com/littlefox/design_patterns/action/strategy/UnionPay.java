package com.littlefox.design_patterns.action.strategy;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:23
 */
public class UnionPay implements Pay {
    @Override
    public void activity() {
        System.out.println("UnionPay 银联62节，三天62折");
    }
}
