package com.example.recyclerview;

public class Item {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Item(String text) {
        this.text = text;
    }

    private String text;

}
