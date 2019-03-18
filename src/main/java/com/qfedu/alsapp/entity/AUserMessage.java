package com.qfedu.alsapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AUserMessage {
    private Integer mesId;

    private String mesHeadimage;

    private Integer mesSex;

    private String mesName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date mesBrithday;

    private Integer mesUseId;

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public String getMesHeadimage() {
        return mesHeadimage;
    }

    public void setMesHeadimage(String mesHeadimage) {
        this.mesHeadimage = mesHeadimage == null ? null : mesHeadimage.trim();
    }

    public Integer getMesSex() {
        return mesSex;
    }

    public void setMesSex(Integer mesSex) {
        this.mesSex = mesSex;
    }

    public String getMesName() {
        return mesName;
    }

    public void setMesName(String mesName) {
        this.mesName = mesName == null ? null : mesName.trim();
    }

    public Date getMesBrithday() {
        return mesBrithday;
    }

    public void setMesBrithday(Date mesBrithday) {
        this.mesBrithday = mesBrithday;
    }

    public Integer getMesUseId() {
        return mesUseId;
    }

    public void setMesUseId(Integer mesUseId) {
        this.mesUseId = mesUseId;
    }
}