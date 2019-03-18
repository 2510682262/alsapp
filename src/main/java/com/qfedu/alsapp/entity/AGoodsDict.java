package com.qfedu.alsapp.entity;

public class AGoodsDict {
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private Integer dictPid;

    private Integer dictStatus;

    private String dictTypeImgs;

    private String dictItemImgs;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem == null ? null : dictItem.trim();
    }

    public Integer getDictPid() {
        return dictPid;
    }

    public void setDictPid(Integer dictPid) {
        this.dictPid = dictPid;
    }

    public Integer getDictStatus() {
        return dictStatus;
    }

    public void setDictStatus(Integer dictStatus) {
        this.dictStatus = dictStatus;
    }

    public String getDictTypeImgs() {
        return dictTypeImgs;
    }

    public void setDictTypeImgs(String dictTypeImgs) {
        this.dictTypeImgs = dictTypeImgs == null ? null : dictTypeImgs.trim();
    }

    public String getDictItemImgs() {
        return dictItemImgs;
    }

    public void setDictItemImgs(String dictItemImgs) {
        this.dictItemImgs = dictItemImgs == null ? null : dictItemImgs.trim();
    }
}