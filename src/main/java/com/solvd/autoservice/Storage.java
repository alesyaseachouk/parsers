package com.solvd.autoservice;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    String name;
    List<Detail> details = new ArrayList<>();

    public Storage(String name) {
        this.name = name;
    }

    public Storage(List<Detail> details) {
        this.details = details;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
