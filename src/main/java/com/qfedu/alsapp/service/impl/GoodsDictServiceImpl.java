package com.qfedu.alsapp.service.impl;

import com.qfedu.alsapp.common.util.ResultUtil;
import com.qfedu.alsapp.common.vo.ClassifyVo;
import com.qfedu.alsapp.common.vo.ResultVo;
import com.qfedu.alsapp.dao.AGoodsDictMapper;
import com.qfedu.alsapp.entity.AGoodsDict;
import com.qfedu.alsapp.service.GoodsDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsDictServiceImpl implements GoodsDictService {

    @Autowired
    private AGoodsDictMapper aGoodsDictMapper;

    @Override
    public ResultVo classify() {

        List<AGoodsDict> aGoodsDicts = aGoodsDictMapper.selectClassify ();

        List<ClassifyVo> classifyVos = new ArrayList<> ();

        for (AGoodsDict aGoodsDictMapper : aGoodsDicts) {
            Integer parentCode = aGoodsDictMapper.getDictPid ();
            if (parentCode == null) {
                int flag = 0;
                for(ClassifyVo classifyVo : classifyVos) {
                    if (classifyVo.getItem ().equals(aGoodsDictMapper.getDictType ())) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    ClassifyVo mInfo = new ClassifyVo();
                    mInfo.setId (aGoodsDictMapper.getDictId ());
                    mInfo.setItem (aGoodsDictMapper.getDictType ());
                    mInfo.setImg (aGoodsDictMapper.getDictTypeImgs ());
                    List<ClassifyVo> cList = new ArrayList<>();
                    mInfo.setChilds (cList);
                    classifyVos.add(mInfo);
                }
            }else {
                for(ClassifyVo menuInfo : classifyVos) {
                    if (aGoodsDictMapper.getDictPid () == menuInfo.getId()) {
                        ClassifyVo mInfo = new ClassifyVo();
                        mInfo.setId (aGoodsDictMapper.getDictId ());
                        mInfo.setItem (aGoodsDictMapper.getDictItem ());
                        mInfo.setImg (aGoodsDictMapper.getDictItemImgs ());
                        menuInfo.getChilds ().add (mInfo);
                        break;
                    }
                }
            }
        }

        return ResultUtil.exec (true,"OK",classifyVos);
    }
}
