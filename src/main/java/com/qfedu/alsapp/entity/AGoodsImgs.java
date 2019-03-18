package com.qfedu.alsapp.entity;

public class AGoodsImgs {
    private Integer imgsId;

    private String imgsPath;

    private Integer imgsGoodsId;

    public Integer getImgsId() {
        return imgsId;
    }

    public void setImgsId(Integer imgsId) {
        this.imgsId = imgsId;
    }

    public String getImgsPath() {
        return imgsPath;
    }

    public void setImgsPath(String imgsPath) {
        this.imgsPath = imgsPath == null ? null : imgsPath.trim();
    }

    public Integer getImgsGoodsId() {
        return imgsGoodsId;
    }

    public void setImgsGoodsId(Integer imgsGoodsId) {
        this.imgsGoodsId = imgsGoodsId;
    }
}