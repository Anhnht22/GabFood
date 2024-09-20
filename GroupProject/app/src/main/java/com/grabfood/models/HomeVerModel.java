package com.grabfood.models;

public class HomeVerModel {
    int image;
    String name;
    String timing;
    String rating;
    String price;

    public HomeVerModel(int image, String name, String timing, String rating, String price) {
        this.image = image;
        this.name = name;
        this.timing = timing;
        this.rating = rating;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTiming() {
        return timing;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }
}
