package com.qfedu.alsapp.dao;


import com.qfedu.alsapp.entity.AUser;

public interface AUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(AUser record);

    int insertSelective(AUser record);

    AUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(AUser record);

    int updateByPrimaryKey(AUser record);
    AUser selectByName(String name);


}