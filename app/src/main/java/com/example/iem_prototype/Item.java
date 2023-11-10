package com.example.iem_prototype;

public class Item {
    private String name;
    private String price;
    private int iconResource;

    public Item(String name, String price, int iconResource) {
        this.name = name;
        this.price = price;
        this.iconResource = iconResource;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getIconResource() {
        return iconResource;
    }
}
