package com.xiaohua.gmall.service;

import com.xiaohua.gmall.bean.PmsSearchParam;
import com.xiaohua.gmall.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
