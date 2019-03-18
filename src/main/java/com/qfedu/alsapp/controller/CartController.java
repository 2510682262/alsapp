package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.ACart;
import com.qfedu.alsapp.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("cart")
@CrossOrigin
public class CartController {



    @Autowired
    private CartService cartService;

    @PostMapping("selectall.do")
    public ResultVo selectAll(String uuid){

        return cartService.selectAllByUserId(uuid);
    }

    @PostMapping("addcart.do")
    public ResultVo AddCart(ACart aCart, String uuid, Integer shopId){

        return cartService.addCart(aCart, uuid, shopId);
    }

    @PostMapping("deleteCart.do")
    public ResultVo deleteCart(Integer cId){

        return cartService.deleteCart(cId);

    }



}
