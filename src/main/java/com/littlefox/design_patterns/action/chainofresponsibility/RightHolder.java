package com.littlefox.design_patterns.action.chainofresponsibility;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 15:11
 */
public abstract class RightHolder {
    //能处理的级别
    private int level =0;
    //责任传递，下一个人责任人是谁
    private RightHolder rightHolder;

    //每个类都要说明一下自己能处理哪些请求
    public RightHolder(int _level){
        this.level = _level;
    }

    //有请示那当然要回应
    public abstract void response();

}
