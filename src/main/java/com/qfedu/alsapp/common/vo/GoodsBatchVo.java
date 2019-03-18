package com.qfedu.alsapp.common.vo;

import com.qfedu.alsapp.entity.AGoods;

import java.util.List;

public class GoodsBatchVo {

    private Integer batchId;

    private String batchName;

    private String batchImg;

    private List<AGoods> goods;

    public List<AGoods> getGoods() {
        return goods;
    }

    public void setGoods(List<AGoods> goods) {
        this.goods = goods;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName == null ? null : batchName.trim();
    }

    public String getBatchImg() {
        return batchImg;
    }

    public void setBatchImg(String batchImg) {
        this.batchImg = batchImg == null ? null : batchImg.trim();
    }

}
