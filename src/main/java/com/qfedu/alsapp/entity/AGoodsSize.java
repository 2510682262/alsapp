package com.qfedu.alsapp.entity;

public class AGoodsSize {
    private Integer sizeId;

    private String sizeName;

    private Integer sizeGoodsId;

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public Integer getSizeGoodsId() {
        return sizeGoodsId;
    }

    public void setSizeGoodsId(Integer sizeGoodsId) {
        this.sizeGoodsId = sizeGoodsId;
    }
}