package com.qfedu.alsapp.dao;


import com.qfedu.alsapp.common.vo.CartGoodVo;
import com.qfedu.alsapp.entity.ACart;

import java.util.List;

public interface ACartMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(ACart record);

    int insertSelective(ACart record);

    ACart selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(ACart record);

    int updateByPrimaryKey(ACart record);
    List<CartGoodVo> selectAllByUserId(Integer cUserId);

}