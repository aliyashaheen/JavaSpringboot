package com.example.Restaurant;

public class FoodItem {
    private String name;
    private double price;

    public FoodItem() {} //default constructor hei yeh

    public FoodItem(String name, double price) { //isko parameterised constructor bolte hei
        this.name = name;
        this.price = price;
    }//jab object create hoga toh ye automatically call ho jayega

    public String getName() {// naam lene ke liye
        return name;
    }

    public void setName(String name) { // naam dene ke liye
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

