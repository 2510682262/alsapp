package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.common.vo.ShopVo;
import com.qfedu.alsapp.entity.AShop;

import java.util.List;

public interface AShopMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(AShop record);

    int insertSelective(AShop record);

    AShop selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(AShop record);

    int updateByPrimaryKey(AShop record);

    List<ShopVo> selectByUserId(int userId);


}