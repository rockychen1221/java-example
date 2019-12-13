package com.littlefox.design_patterns.structure.proxy;

public class PayProxyTest {
    public static void main(String[] args) {
        PayProxy proxy = new PayProxy();
        proxy.payment();

        QRCodePay qrCodePay = new QRCodePay();
        PayProxy payProxy= new PayProxy(qrCodePay);
        payProxy.payment();
    }
}
