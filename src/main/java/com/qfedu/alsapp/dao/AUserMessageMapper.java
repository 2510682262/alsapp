package com.qfedu.alsapp.dao;


import com.qfedu.alsapp.entity.AUserMessage;

public interface AUserMessageMapper {
    int deleteByPrimaryKey(Integer mesId);

    int insert(AUserMessage record);

    int insertSelective(AUserMessage record);

    AUserMessage selectByPrimaryKey(Integer mesId);

    AUserMessage selectByMesUserId(Integer mesUserId);

    int updateByPrimaryKeySelective(AUserMessage record);

    int updateByPrimaryKey(AUserMessage record);
}