package com.littlefox.design_patterns.created.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        PayPrototype nfcPrototype = new PayPrototype();
        nfcPrototype.payment();

        QRCodePay qrCodePay = new QRCodePay();
        PayPrototype qrCodePrototype = new PayPrototype(qrCodePay);
        qrCodePrototype.payment();

    }
}
