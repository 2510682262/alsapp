package com.qfedu.alsapp.common.vo;

import com.qfedu.alsapp.entity.AGoodsImgs;
import com.qfedu.alsapp.entity.AGoodsSize;

import java.util.List;

public class GoodsVo {

    private Integer goodsId;

    private String goodsName;

    private Integer goodsType;

    private Integer goodsBatch;

    private String goodsUnit;

    private Double goodsPrice;

    private String goodsImg;

    private List<AGoodsImgs> imgs;

    private List<AGoodsSize> sizes;

    public List<AGoodsImgs> getImgs() {
        return imgs;
    }

    public void setImgs(List<AGoodsImgs> imgs) {
        this.imgs = imgs;
    }

    public List<AGoodsSize> getSizes() {
        return sizes;
    }

    public void setSizes(List<AGoodsSize> sizes) {
        this.sizes = sizes;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getGoodsBatch() {
        return goodsBatch;
    }

    public void setGoodsBatch(Integer goodsBatch) {
        this.goodsBatch = goodsBatch;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

}
