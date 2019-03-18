package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.common.vo.ClassifyVo;
import com.qfedu.alsapp.entity.AGoodsDict;

import java.util.List;

public interface AGoodsDictMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(AGoodsDict record);

    int insertSelective(AGoodsDict record);

    AGoodsDict selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(AGoodsDict record);

    int updateByPrimaryKey(AGoodsDict record);

    List<AGoodsDict> selectClassify();


}