package com.xiaohua.gmall.service;

import com.xiaohua.gmall.bean.UmsMember;
import com.xiaohua.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
