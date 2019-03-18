package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.service.GoodsBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("batch")
@CrossOrigin
public class GoodsBatchController {

    @Autowired
    private GoodsBatchService goodsBatchService;

    @RequestMapping("selectById.do")
    public ResultVo selectByBatch(int batchId){

        return goodsBatchService.selectById (batchId);

    }


    public static void main(String [] args){

        Map<String ,String> map = new HashMap<>();

        map.put("a","a");
        System.out.println(map.get("a"));
        map.remove("a");
        System.out.println(map.get("a"));


    }


}
