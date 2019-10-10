package com.littlefox.design_patterns.action.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 11:44
 */
public class Wife implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("老婆知道了："+arg);
    }
}
