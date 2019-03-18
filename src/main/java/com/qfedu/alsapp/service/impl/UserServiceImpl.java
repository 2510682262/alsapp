package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.AUserMapper;
import com.qfedu.alsapp.dao.AUserMessageMapper;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AUserMapper aUserMapper;

    @Override
    public ResultVo selectByName(String name, String password) {
        AUser aUser = aUserMapper.selectByName(name);
        if (aUser != null) {
            if (aUser.getUserPassword().equals(password)) {
                return ResultUtil.exec(true, "OK", TokenUtils.create(aUser));
            }
        }

        return ResultUtil.exec(false, "账号或密码错误", null);

    }

    @Override
    public ResultVo register(AUser aUser) {


        if (aUser.getUserName ().equals ("") && aUser.getUserPassword ().equals ("")){
            return ResultUtil.exec(false,"ERROR","用户名密码不能为空");
        } else {
            AUser aUser2 = aUserMapper.selectByName(aUser.getUserName());
            if(aUser2==null){
                aUserMapper.insert(aUser);
                return ResultUtil.exec(true,"OK",null);

            } else {
                return ResultUtil.exec(false, "账号已存在", null);
            }

        }

    }

    @Override
    public ResultVo loginOut(String uuid) {

        if (uuid.equals("")||uuid==null){
            ResultUtil.exec(true,"退出异常",null);
        }
        TokenUtils.map.remove(uuid);
        return ResultUtil.exec(true,"OK",null);
    }


}