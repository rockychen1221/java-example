package com.littlefox.design_patterns.action.observer;

public class ObserverTest {

    public static void main(String[] args) {
        //被观察者
        Son son = new Son();
        Daughter daughter = new Daughter();
        //既是观察者（观察儿女的消费）也是被观察者（向老婆报告家庭支出）
        Me me = new Me();
        //观察者
        Wife wife = new Wife();

        son.addObserver(me);
        daughter.addObserver(me);

        me.addObserver(wife);

        son.consumption(10);
        daughter.consumption(3000);

    }

}
