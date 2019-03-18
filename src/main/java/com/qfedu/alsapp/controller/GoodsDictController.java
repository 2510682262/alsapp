package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.service.GoodsDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goodsDict")
@CrossOrigin
public class GoodsDictController {

    @Autowired
    private GoodsDictService goodsDictService;

    @RequestMapping("classify.do")
    public ResultVo Classify(){

        return goodsDictService.classify ();

    }

}
