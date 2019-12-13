package com.littlefox.design_patterns.structure.facade;

/**
 * 外观/门面模式
 */
public class FacadeTest {
    public static void main(String[] args) {
        // case 1
        Transfer transfer = new AliPayImpl();
        transfer.cardId("12345678");
        transfer.money(100000);
        transfer.notice();

        System.out.println("============================");
        // case 2
        FacadeMode facadeMode = new FacadeMode();
        facadeMode.transfer("12345678",100000);

    }
}
