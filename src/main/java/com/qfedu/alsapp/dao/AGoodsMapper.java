package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.entity.AGoods;
import com.qfedu.alsapp.entity.AGoodsImgs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AGoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(AGoods record);

    int insertSelective(AGoods record);

    AGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(AGoods record);

    int updateByPrimaryKey(AGoods record);

    List<AGoods> selectByType(int type);

    List<AGoods> selectByBatch(int batch);
    List<AGoods> selectByGoodsName(@Param("name") String name);

}