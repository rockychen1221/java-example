package com.littlefox.design_patterns.action.strategy;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-08 16:48
 */
public class Wool {

    private Pay pay;

    public Wool(Pay pay){
        this.pay = pay;
    }

    //薅羊毛活动
    public void activity(){
        this.pay.activity();
    }

}
