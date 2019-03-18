package com.qfedu.alsapp.entity;

public class AUserAddr {
    private Integer addrId;

    private String addrUserName;

    private String addrPhone;

    private String addrArea;

    private String addrInfo;

    private Integer addrFlag;

    private Integer addrUserId;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getAddrUserName() {
        return addrUserName;
    }

    public void setAddrUserName(String addrUserName) {
        this.addrUserName = addrUserName == null ? null : addrUserName.trim();
    }

    public String getAddrPhone() {
        return addrPhone;
    }

    public void setAddrPhone(String addrPhone) {
        this.addrPhone = addrPhone == null ? null : addrPhone.trim();
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea == null ? null : addrArea.trim();
    }

    public String getAddrInfo() {
        return addrInfo;
    }

    public void setAddrInfo(String addrInfo) {
        this.addrInfo = addrInfo == null ? null : addrInfo.trim();
    }

    public Integer getAddrFlag() {
        return addrFlag;
    }

    public void setAddrFlag(Integer addrFlag) {
        this.addrFlag = addrFlag;
    }

    public Integer getAddrUserId() {
        return addrUserId;
    }

    public void setAddrUserId(Integer addrUserId) {
        this.addrUserId = addrUserId;
    }
}