package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.ACart;

public interface CartService {
    ResultVo selectAllByUserId(String uuid);


    ResultVo addCart(ACart aCart,String uuid,Integer shopId);
    ResultVo deleteCart(Integer cId);




}
