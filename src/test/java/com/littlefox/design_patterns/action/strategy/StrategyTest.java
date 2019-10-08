package com.littlefox.design_patterns.action.strategy;

/**
 * 策略模式测试类
 *
 * 策略模式的好处就是:体现了高内聚低耦合的特性
 */
public class StrategyTest {
    public static void main(String[] args) {
        Wool wool;

        System.out.println("先从62开始");
        wool = new Wool(new UnionPay());
        wool.activity();

        System.out.println("然后是88");
        wool = new Wool(new WeChatPay());
        wool.activity();

        System.out.println("最后是1212");
        wool = new Wool(new AliPay());
        wool.activity();

        System.out.println("一个不落，薅的干净，才是羊毛党的基本修养!");
    }
}
