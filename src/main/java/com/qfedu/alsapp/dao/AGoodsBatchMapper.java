package com.qfedu.alsapp.dao;

import com.qfedu.alsapp.entity.AGoodsBatch;

public interface AGoodsBatchMapper {
    int deleteByPrimaryKey(Integer batchId);

    int insert(AGoodsBatch record);

    int insertSelective(AGoodsBatch record);

    AGoodsBatch selectByPrimaryKey(Integer batchId);

    int updateByPrimaryKeySelective(AGoodsBatch record);

    int updateByPrimaryKey(AGoodsBatch record);
}