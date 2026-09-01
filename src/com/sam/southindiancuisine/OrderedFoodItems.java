package com.sam.southindiancuisine;

public class OrderedFoodItems {

    DinningMenu dinningMenu;
    int quantity;
    double price;

    public OrderedFoodItems(DinningMenu dinningMenu, int quantity, double price) {
        this.dinningMenu = dinningMenu;
        this.quantity = quantity;
        this.price = price;
    }
}
