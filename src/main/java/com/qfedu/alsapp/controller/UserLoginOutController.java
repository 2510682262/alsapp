package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserLoginOutController {



    @Autowired
    private UserService userService;

    @PostMapping("loginout.do")
    public ResultVo loginOut(String uuid){

        return userService.loginOut(uuid);
    }


}
