package com.littlefox.design_patterns.structure.bridge;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-28 10:55
 */
public abstract class Pay {

    /**
     * 付款
     */
    protected abstract void payment();

    /**
     * 优惠活动
     */
    protected abstract void promotions();

    //不管什么支付，我都是为了省钱而选择的
    public void saveMoney(){
        this.payment();
        this.promotions();
    }



}