package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping("/register.do")
    ResultVo register(AUser aUser){
        return userService.register(aUser);
    }

}
