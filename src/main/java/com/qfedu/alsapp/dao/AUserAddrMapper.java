package com.qfedu.alsapp.dao;


import com.qfedu.alsapp.entity.AUserAddr;

import java.util.List;

public interface AUserAddrMapper {
    int deleteByPrimaryKey(Integer addrId);

    int insert(AUserAddr record);

    int insertSelective(AUserAddr record);

    AUserAddr selectByPrimaryKey(Integer addrId);

    int updateByPrimaryKeySelective(AUserAddr record);

    int updateByPrimaryKey(AUserAddr record);

    AUserAddr selectByUidFlag(Integer addrUserId);

    List<AUserAddr> selectAddr(Integer addrUserId);
}