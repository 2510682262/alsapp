package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserLoginController {

    @Autowired
    private UserService userService;

    @PostMapping("login.do")
    public ResultVo login(String name,String password){
        return userService.selectByName(name,password);
    }



}
