package com.example.recyclerviewtest;

public class ModelClass {

    int image;
    String number, info;

    public ModelClass(int image, String number, String info){
        this.image = image;
        this.number = number;
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
