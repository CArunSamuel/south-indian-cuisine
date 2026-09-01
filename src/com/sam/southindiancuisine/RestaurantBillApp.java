

package com.sam.southindiancuisine;
import java.util.Scanner;

public class RestaurantBillApp {

    public static void main(String[] args) {

        DinningMenu food1 = new DinningMenu(101, "Breakfast", "Dosa", 60.50);
        DinningMenu food2 = new DinningMenu(102, "Breakfast", "Idli", 40);
        DinningMenu food3 = new DinningMenu(103, "Soup", "Veg Pepper Soup", 50);
        DinningMenu food4 = new DinningMenu(104, "Soup", "Tomato Soup", 45);
        DinningMenu food5 = new DinningMenu(105, "Uthappam", "Onion Uthappam", 150);
        DinningMenu food6 = new DinningMenu(106, "Uthappam", "Paneer Uthappam", 180);

        DinningMenu[] menu = {food1, food2, food3, food4, food5, food6};

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i].foodName);
        }




    /*  System.out.println("================================");
      System.out.println("    WELCOME TO ANANDHA BHAVAN  ");
      System.out.println("================================");
  */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Food Id ");
        int selectedFoodId = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();


        for (int i = 0; i < menu.length; i++) {

            if (menu[i].foodId == selectedFoodId) {

                System.out.println("Food Found!");
                System.out.println("Food: " + menu[i].foodName);
                System.out.println("Price: " + menu[i].price);

            }
            else  {
                System.out.println("Food Not Found!");
            }
        }


    }
}