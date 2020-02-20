package com.xiaohua.gmall.service;

import com.xiaohua.gmall.bean.OmsOrder;

public interface OrderService{
    String genTradeCode(String memberId);

    String checkTradeCode(String memberId, String tradeCode);

    void saveOrder(OmsOrder omsOrder);

    OmsOrder getOrderByOutTradeNo(String outTradeNo);

    void updateOrder(OmsOrder omsOrder);

}
