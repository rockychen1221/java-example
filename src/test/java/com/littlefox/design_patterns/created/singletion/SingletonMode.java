package com.littlefox.design_patterns.created.singletion;

/**
 * @author rockychen
 * @date
 */
public class SingletonMode {

    private SingletonMode singletonMode;

    private SingletonMode(){}

    public SingletonMode getInstance(){
        if (singletonMode == null){
            singletonMode = new SingletonMode();
        }
        return this.singletonMode;
    }

}
