package com.littlefox.design_patterns.action.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 11:33
 */
public class Me extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我知道了 "+o.getClass().getSimpleName()+" 消费了："+arg);
        this.report("报告老婆 家庭支出了："+arg);
    }

    private void report(String text){
        this.setChanged();
        this.notifyObservers(text);
    }

}
