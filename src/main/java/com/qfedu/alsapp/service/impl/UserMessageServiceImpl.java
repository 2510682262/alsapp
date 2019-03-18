package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.util.TokenUtils;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.AUserMessageMapper;
import com.qfedu.alsapp.entity.AUser;
import com.qfedu.alsapp.entity.AUserMessage;
import com.qfedu.alsapp.service.UserMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMessageServiceImpl implements UserMessageService {

    @Autowired
    private AUserMessageMapper aUserMessageMapper;


    @Override
    public ResultVo addMessage(AUserMessage aUserMessage, String uuid) {


            AUser user = TokenUtils.get(uuid);
            if(user==null){
                return ResultUtil.exec(false, "ERRORS", "请登录后再添加信息");
            }
            aUserMessage.setMesUseId(user.getUserId());

        AUserMessage aUserMessage1 = aUserMessageMapper.selectByMesUserId(aUserMessage.getMesUseId());
        if(aUserMessage1!=null){
            aUserMessage.setMesId(aUserMessage1.getMesId());

            aUserMessageMapper.updateByPrimaryKey(aUserMessage);
            return ResultUtil.exec(true, "修改成功", null);
        }
        aUserMessageMapper.insert(aUserMessage);
            return ResultUtil.exec(true, "添加成功", null);











    }
}
