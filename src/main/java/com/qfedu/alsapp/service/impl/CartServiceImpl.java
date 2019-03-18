package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.CartGoodVo;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.ACartMapper;
import com.qfedu.alsapp.dao.AShopMapper;
import com.qfedu.alsapp.entity.ACart;
import com.qfedu.alsapp.entity.AShop;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private ACartMapper aCartMapper;

    @Autowired
    private AShopMapper aShopMapper;

    @Override
    public ResultVo selectAllByUserId(String  uuid) {
        AUser user = TokenUtils.get(uuid);
        if (user == null) {
            return ResultUtil.exec(false, "请登录后再查看信息", null);
        }

        List<CartGoodVo> cartGoodVos = aCartMapper.selectAllByUserId(user.getUserId());


        return ResultUtil.exec(true, "OK", cartGoodVos);
    }

    @Override
    public ResultVo addCart(ACart aCart, String uuid,Integer shopId) {
        AUser user = TokenUtils.get(uuid);
        if (user == null) {
            return ResultUtil.exec(false, "请登录后再查看信息", null);
        }


        AShop aShop = aShopMapper.selectByPrimaryKey(shopId);
        if(aShop==null){
            return ResultUtil.exec(false, "没有该订单", null);
        }
        String cnumber = UUID.randomUUID().toString().replaceAll("-","");
      aCart.setcNumber(cnumber);

        aShopMapper.deleteByPrimaryKey(shopId);
        aCartMapper.insertSelective(aCart);
        return ResultUtil.exec(true, "OK", null);
    }

    @Override
    public ResultVo deleteCart(Integer cId) {
        ACart aCart = aCartMapper.selectByPrimaryKey(cId);

        if(aCart==null){
            return ResultUtil.exec(false, "没有该订单", null);
        }
        aCartMapper.deleteByPrimaryKey(cId);

        return ResultUtil.exec(true, "OK", null);
    }


}
