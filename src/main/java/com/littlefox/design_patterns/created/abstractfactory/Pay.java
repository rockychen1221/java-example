package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:22
 *
 * 支付接口
 */
public interface Pay {
    //付款
    void payment();
    //支付方式
    void payMethod();
}
