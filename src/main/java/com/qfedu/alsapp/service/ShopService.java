package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AShop;

public interface ShopService {

    public ResultVo add(AShop aShop, String uuid);

    public ResultVo updateByNum(AShop aShop);

    public ResultVo deleteByShopId(AShop aShop);

    public ResultVo selectByUserId(String userId);

}
