package com.sam.southindiancuisine;

public class RestaurantBill {
    OrderedFoodItems[] orderedFoodItems;
    int numberOfFoodItems;
    double totalPrice;

    RestaurantBill(){
        this.orderedFoodItems = new OrderedFoodItems[10];
        this.numberOfFoodItems = 0;
        this.totalPrice = 0;
    }
}
