package com.littlefox.design_patterns.created.factory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:22
 *
 * 支付接口
 */
public interface Pay {
    //转账
    void transfer();
    //收款
    void receipt();
    //付款
    void payment();
}
