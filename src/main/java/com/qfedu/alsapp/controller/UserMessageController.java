package com.qfedu.alsapp.controller;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.entity.AUserMessage;
import com.qfedu.alsapp.service.UserMessageService;
import com.qfedu.alsapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
@CrossOrigin
public class UserMessageController {

    @Autowired
    private UserMessageService userMessageService;

    @PostMapping("addMessage.do")
    public ResultVo addUserMessage(AUserMessage aUserMessage, String uuid){
        return  userMessageService.addMessage(aUserMessage,uuid);
    }

}
