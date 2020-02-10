package com.xiaohua.gmall.service;

import com.xiaohua.gmall.bean.OmsCartItem;

import java.util.List;

public interface CartService {

    OmsCartItem ifCartExistByUser(String memberId, String skuId);

    void addCart(OmsCartItem omsCartItem);

    void updateCart(OmsCartItem omsCartItemFromDb);

    void flushCartCache(String memberId);

    List<OmsCartItem> cartList(String memberId);

    void checkCart(OmsCartItem omsCartItem);

    void delCart(String cartId, String memberId);
}
