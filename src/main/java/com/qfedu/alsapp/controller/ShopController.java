package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AShop;
import com.qfedu.alsapp.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shop")
@CrossOrigin
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("add.do")
    public ResultVo addShop(AShop aShop, String uuid){

        return shopService.add (aShop,uuid);

    }

    @RequestMapping("update.do")
    public ResultVo updateShop(AShop aShop, String uuid){

        return shopService.updateByNum (aShop);

    }

    @RequestMapping("delete.do")
    public ResultVo deleteShop(AShop aShop, String uuid){

        return shopService.deleteByShopId (aShop);

    }

    @RequestMapping("selectByUserId.do")
    public ResultVo queryByUserId(String uuid){

        return shopService.selectByUserId (uuid);

    }



}
