package com.littlefox.design_patterns.action.observer;

import java.util.Observable;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 10:41
 */
public class Son extends Observable {

    public void consumption(double money){
        System.out.println("败家儿子消费了"+money);
        this.setChanged();
        this.notifyObservers(money);
    }

}
