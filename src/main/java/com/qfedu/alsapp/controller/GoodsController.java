package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("selectByType.do")
    public ResultVo selectByType(int type){

        return goodsService.selectByType (type);

    }

    @RequestMapping("selectByGoodsId.do")
    public ResultVo selectByGoodsId(int id){

        return goodsService.selectById (id);

    }


    @RequestMapping("selectByGoodsName.do")
    public ResultVo selectByGoodsName(String name){

        return goodsService.selectByGoodsName (name);

    }

}
