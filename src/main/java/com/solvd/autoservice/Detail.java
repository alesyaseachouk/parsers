package com.solvd.autoservice;

import javax.xml.bind.annotation.XmlElement;

public class Detail {

    private String detailName;

    public String getDetailName() {
        return detailName;
    }

    @XmlElement
    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

}
