package com.littlefox.design_patterns.created.singletion;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 14:41
 */
public class AlipayTest {
    /**
     * 通过Alipay.getInstance() 可以看到每次都是得到Alipay
     * @param args
     */
    public static void main(String[] args) {
        Alipay alipay = Alipay.getInstance();
        alipay.alipayInfo();
        Alipay alipay1 = Alipay.getInstance();
        alipay1.alipayInfo();
        Alipay alipay2 = Alipay.getInstance();
        alipay2.alipayInfo();
    }
}
