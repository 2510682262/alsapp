package com.qfedu.alsapp.common.vo;

import java.util.List;

public class ClassifyVo {

    private Integer id;

    private String item;

    private String img;

    private List<ClassifyVo> childs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<ClassifyVo> getChilds() {
        return childs;
    }

    public void setChilds(List<ClassifyVo> childs) {
        this.childs = childs;
    }
}
