package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUser;

public interface UserService {


    //验证登录
    ResultVo selectByName(String name, String password);


    ResultVo register(AUser aUser);
    ResultVo loginOut(String uuid);

}
