package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUserAddr;
import com.qfedu.alsapp.service.UserAddrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserAddrController {


    @Autowired
    private UserAddrService userAddrService;

    @PostMapping("addAddr.do")
    ResultVo addAddr(AUserAddr aUserAddr,String uuid){

      return  userAddrService.addAddr(aUserAddr,uuid);

    }

    @PostMapping("deleteAddr.do")
    ResultVo deleteAddr(Integer addrId){
        return  userAddrService.deleteAddr(addrId);
    }

    @PostMapping("selectAddr.do")
    ResultVo selectAddr(Integer addrUserId, String uuid){
        return  userAddrService.selectAddr(addrUserId, uuid);
    }

    @PostMapping("updateAddr.do")
    ResultVo updateAddr(AUserAddr aUserAddr,String uuid){
        return  userAddrService.updateAddr(aUserAddr, uuid);
    }

    @PostMapping("searchAddr.do")
    ResultVo searchAddrByAddrId(Integer aAddrId){
        return  userAddrService.searchAddrByAddrId(aAddrId);
    }



}
