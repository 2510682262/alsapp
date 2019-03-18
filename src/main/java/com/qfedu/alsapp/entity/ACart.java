package com.qfedu.alsapp.entity;

public class ACart {
    private Integer cId;

    private String cNumber;

    private Integer cGoodsId;

    private Integer cNum;

    private Double cPrice;

    private Integer cUserId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber == null ? null : cNumber.trim();
    }

    public Integer getcGoodsId() {
        return cGoodsId;
    }

    public void setcGoodsId(Integer cGoodsId) {
        this.cGoodsId = cGoodsId;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public Double getcPrice() {
        return cPrice;
    }

    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
    }
}