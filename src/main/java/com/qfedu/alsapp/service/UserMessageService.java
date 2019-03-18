package com.qfedu.alsapp.service;

import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.entity.AUserMessage;

public interface UserMessageService {
    //用户信息添加
    public ResultVo addMessage(AUserMessage aUserMessage, String uuid);



}
