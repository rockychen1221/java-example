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
        System.out.println("alipay是指阿里巴巴旗下的支付工具支付宝，是国内领先的第三方支付平台。支付宝，是以每个人为中心，以实名和信任为基础的一站式场景平台。支付宝不仅支持线上消费支付，" +
                "也通过扫码支付的形式拓展了线下支付服务，包括餐饮、超市、便利店、出租车、公共交通等。同时，支付宝也大力拓展海外支付业务，还在国内金融领域有所作为，如为余额宝、基金等理财产品提供支付服务。");
    }
}
