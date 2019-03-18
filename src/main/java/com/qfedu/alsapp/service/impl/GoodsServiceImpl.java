package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.vo.GoodsVo;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.AGoodsImgsMapper;
import com.qfedu.alsapp.dao.AGoodsMapper;
import com.qfedu.alsapp.dao.AGoodsSizeMapper;
import com.qfedu.alsapp.entity.AGoods;
import com.qfedu.alsapp.entity.AGoodsImgs;
import com.qfedu.alsapp.entity.AGoodsSize;
import com.qfedu.alsapp.service.GoodsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private AGoodsMapper aGoodsMapper;

    @Autowired
    private AGoodsImgsMapper aGoodsImgsMapper;

    @Autowired
    private AGoodsSizeMapper aGoodsSizeMapper;

    @Override
    public ResultVo selectByType(int type) {

        return ResultUtil.exec (true,"OK",aGoodsMapper.selectByType (type));
    }


    @Override
    public ResultVo selectById(int id) {

        GoodsVo goodsVo = new GoodsVo ();
        AGoods aGoods = aGoodsMapper.selectByPrimaryKey (id);
        List<AGoodsImgs> aGoodsImgs = aGoodsImgsMapper.selectByGoodsId (id);
        List<AGoodsSize> aGoodsSizes = aGoodsSizeMapper.selectByGoodsId (id);
        BeanUtils.copyProperties (aGoods,goodsVo);
        goodsVo.setImgs (aGoodsImgs);
        goodsVo.setSizes (aGoodsSizes);

        return ResultUtil.exec (true,"OK",goodsVo);
    }
    @Override
    public ResultVo selectByGoodsName(String name) {

        return ResultUtil.exec (true,"OK",aGoodsMapper.selectByGoodsName (name));

    }

}
