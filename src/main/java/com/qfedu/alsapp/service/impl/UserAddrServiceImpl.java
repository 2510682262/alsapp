package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.ResultVo;

import com.qfedu.alsapp.dao.AUserAddrMapper;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.entity.AUserAddr;
import com.qfedu.alsapp.service.UserAddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserAddrServiceImpl implements UserAddrService {

    @Autowired
    private AUserAddrMapper aUserAddrMapper;

    @Override
    public ResultVo addAddr(AUserAddr aUserAddr,String uuid) {

        AUser user = TokenUtils.get(uuid);
        if(user==null){
            return ResultUtil.exec(false, "请登录后再添加信息", null);
        }
        aUserAddr.setAddrUserId(user.getUserId());
        if (aUserAddr.getAddrUserName ().equals ("") && aUserAddr.getAddrPhone ().equals ("") && aUserAddr.getAddrArea ().equals ("")){

        } else {
            if(aUserAddr.getAddrFlag()==1){

                AUserAddr aUserAddr1 = aUserAddrMapper.selectByUidFlag(aUserAddr.getAddrUserId());
                if(aUserAddr1!=null){
                    aUserAddr1.setAddrFlag(0);
                    aUserAddrMapper.updateByPrimaryKey(aUserAddr1);
                }
            }
        }

        aUserAddrMapper.insert(aUserAddr);
        return ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo deleteAddr(Integer addrId) {

        AUserAddr aUserAddr = aUserAddrMapper.selectByPrimaryKey(addrId);
        if(aUserAddr==null){
            return  ResultUtil.exec(false, "地址不存在", null);
        }
        aUserAddrMapper.deleteByPrimaryKey(addrId);
        return  ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo selectAddr(Integer addrUserId, String uuid) {

        AUser user = TokenUtils.get(uuid);
        if(user==null){
            return ResultUtil.exec(false, "请登录后再查看信息", null);
        }
        if(addrUserId==null){
            return ResultUtil.exec(false, "ERROR", null);
        }

        List<AUserAddr> aUserAddrs = aUserAddrMapper.selectAddr(addrUserId);

        return  ResultUtil.exec(true, "OK", aUserAddrs);
    }


    @Override
    public ResultVo updateAddr(AUserAddr aUserAddr,String uuid) {

        if(aUserAddr.getAddrFlag()==1){

            AUser aUser = TokenUtils.get(uuid);

            AUserAddr aUserAddr1 = aUserAddrMapper.selectByUidFlag(aUser.getUserId());
            if(aUserAddr1!=null){
                aUserAddr1.setAddrFlag(0);
                aUserAddrMapper.updateByPrimaryKeySelective(aUserAddr1);
                aUserAddrMapper.updateByPrimaryKeySelective(aUserAddr);
                return  ResultUtil.exec(true, "OK", null);
            }
        }

        aUserAddrMapper.updateByPrimaryKeySelective(aUserAddr);
        return  ResultUtil.exec(true, "OK", null);

    }

    @Override
    public ResultVo searchAddrByAddrId(Integer aAddrId) {

        AUserAddr aUserAddr = aUserAddrMapper.selectByPrimaryKey(aAddrId);
        if(aUserAddr==null){
            return  ResultUtil.exec(false, "地址不存在", null);
        }
        return  ResultUtil.exec(true, "OK", aUserAddr);
    }


}
