package com.littlefox.design_patterns.action.observer;

import java.util.Observable;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 10:42
 */
public class Daughter extends Observable {

    public void consumption(double money){
        System.out.println("宝贝女儿消费了"+money);
        this.setChanged();
        this.notifyObservers(money);
    }
}
