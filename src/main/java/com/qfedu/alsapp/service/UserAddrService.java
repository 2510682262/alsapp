package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUserAddr;

public interface UserAddrService {

    ResultVo addAddr(AUserAddr aUserAddr,String uuid);

    ResultVo deleteAddr(Integer addrId);

    ResultVo selectAddr(Integer addrUserId,String uuid);

    ResultVo updateAddr(AUserAddr aUserAddr,String uuid);

    ResultVo searchAddrByAddrId(Integer aAddrId);


}
