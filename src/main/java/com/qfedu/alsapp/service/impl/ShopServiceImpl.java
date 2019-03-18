package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.common.vo.ShopVo;
import com.qfedu.alsapp.dao.AShopMapper;
import com.qfedu.alsapp.entity.AShop;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private AShopMapper aShopMapper;

    @Override
    public ResultVo add(AShop aShop, String uuid) {

        if (uuid == null){
            return ResultUtil.exec (false,"ERROR","请登录后添加购物车");
        } else {
            AUser aUser = TokenUtils.get (uuid);
            if (aUser != null){
                aShop.setShopUserId (aUser.getUserId ());
                aShopMapper.insertSelective (aShop);
                return ResultUtil.exec (true,"OK","添加成功");
            }else {
                return ResultUtil.exec (false,"ERROR","登录异常");
            }
        }
    }

    @Override
    public ResultVo updateByNum(AShop aShop) {

        aShopMapper.updateByPrimaryKeySelective (aShop);

        return ResultUtil.exec (true,"Ok",null);
    }

    @Override
    public ResultVo deleteByShopId(AShop aShop) {

        aShopMapper.deleteByPrimaryKey (aShop.getShopId ());

        return ResultUtil.exec (true,"OK",null);
    }

    @Override
    public ResultVo selectByUserId(String uuid) {

        List<ShopVo> list = null;
        if(uuid == null){
            return ResultUtil.exec (false,"ERROR","请登录后查看购物车");
        }else {
            AUser aUser = TokenUtils.get (uuid);
            if (aUser != null){
                list = aShopMapper.selectByUserId (aUser.getUserId ());
                return ResultUtil.exec (true,"OK",list);
            }else {
                return ResultUtil.exec (false,"ERROR","登录异常");
            }
        }

    }
}
