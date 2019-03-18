package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.entity.AGoodsSize;

import java.util.List;

public interface AGoodsSizeMapper {
    int deleteByPrimaryKey(Integer sizeId);

    int insert(AGoodsSize record);

    int insertSelective(AGoodsSize record);

    AGoodsSize selectByPrimaryKey(Integer sizeId);

    int updateByPrimaryKeySelective(AGoodsSize record);

    int updateByPrimaryKey(AGoodsSize record);

    List<AGoodsSize> selectByGoodsId(int id);
}