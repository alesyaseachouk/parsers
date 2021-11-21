package com.solvd.autoservice;

public abstract class Detail {

    private String detailName;
    private boolean onStorage;

    public Detail(String detailName, boolean onStorage) {
        this.detailName = detailName;
        this.onStorage = onStorage;
    }

    public Detail(String detailName){
        this.detailName = detailName;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public boolean isOnStorage() {
        return onStorage;
    }

    public void setOnStorage(boolean onStorage) {
        this.onStorage = onStorage;
    }


}
