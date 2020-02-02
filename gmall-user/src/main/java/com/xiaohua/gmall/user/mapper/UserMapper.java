package com.xiaohua.gmall.user.mapper;

import com.xiaohua.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember>{
    List<UmsMember> selectAllUser();
}
