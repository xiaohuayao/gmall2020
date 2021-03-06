package com.xiaohua.gmall.service;

import com.xiaohua.gmall.bean.PaymentInfo;

import java.util.Map;

public interface PaymentService {
    void savePaymentInfo(PaymentInfo paymentInfo);

    void updatePayment(PaymentInfo paymentInfo);

    Map<String,Object> checkAlipayPayment(String out_trade_no);

    void sendDelayPaymentResultCheckQueue(String outTradeNo, int count);
}
