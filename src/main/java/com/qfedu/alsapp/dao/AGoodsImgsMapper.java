package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.entity.AGoodsImgs;

import java.util.List;

public interface AGoodsImgsMapper {
    int deleteByPrimaryKey(Integer imgsId);

    int insert(AGoodsImgs record);

    int insertSelective(AGoodsImgs record);

    AGoodsImgs selectByPrimaryKey(Integer imgsId);

    int updateByPrimaryKeySelective(AGoodsImgs record);

    int updateByPrimaryKey(AGoodsImgs record);

    List<AGoodsImgs> selectByGoodsId(int id);
}