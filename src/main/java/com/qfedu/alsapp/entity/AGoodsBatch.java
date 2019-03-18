package com.qfedu.alsapp.entity;

public class AGoodsBatch {
    private Integer batchId;

    private String batchName;

    private String batchImg;

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