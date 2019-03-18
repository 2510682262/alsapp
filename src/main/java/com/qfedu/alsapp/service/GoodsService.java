package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;

public interface GoodsService {

    public ResultVo selectByType(int type);

    public ResultVo selectById(int id);

    public ResultVo selectByGoodsName(String name);
}
