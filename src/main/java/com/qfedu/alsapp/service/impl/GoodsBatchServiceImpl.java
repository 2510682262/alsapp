package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.vo.GoodsBatchVo;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.AGoodsBatchMapper;
import com.qfedu.alsapp.dao.AGoodsMapper;
import com.qfedu.alsapp.entity.AGoods;
import com.qfedu.alsapp.entity.AGoodsBatch;
import com.qfedu.alsapp.service.GoodsBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsBatchServiceImpl implements GoodsBatchService {

    @Autowired
    private AGoodsBatchMapper aGoodsBatchMapper;

    @Autowired
    private AGoodsMapper aGoodsMapper;


    @Override
    public ResultVo selectById(int batchId) {

        GoodsBatchVo goodsBatchVo = new GoodsBatchVo ();

        AGoodsBatch aGoodsBatch = aGoodsBatchMapper.selectByPrimaryKey (batchId);
        List<AGoods> aGoods = aGoodsMapper.selectByBatch (batchId);
        goodsBatchVo.setBatchId (aGoodsBatch.getBatchId ());
        goodsBatchVo.setBatchName (aGoodsBatch.getBatchName ());
        goodsBatchVo.setBatchImg (aGoodsBatch.getBatchImg ());
        goodsBatchVo.setGoods (aGoods);

        return ResultUtil.exec (true,"OK",goodsBatchVo);
    }
}
