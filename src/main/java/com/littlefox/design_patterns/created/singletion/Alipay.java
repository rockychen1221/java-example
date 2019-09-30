package com.littlefox.design_patterns.created.singletion;

/**
 * @author rockychen
 *
 * 通用单例模式
 */
public class Alipay {

    private static Alipay alipay = new Alipay();
    //限制产生多个对象
    private Alipay(){}

    //唯一的获取创建对象方法
    public static Alipay getInstance(){
        return alipay;
    }

    public void alipayInfo(){
        System.out.println("支付宝（中国）网络技术有限公司 [1]  是国内的第三方支付平台，致力于提供“简单、安全、快速”的支付解决方案 [2]  。" +
                "支付宝公司从2004年建立开始，始终以“信任”作为产品和服务的核心。旗下有“支付宝”与“支付宝钱包”两个独立品牌。自2014年第二季度开始成为当前全球最大的移动支付厂商。");
    }
}
