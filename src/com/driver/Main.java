package com.driver;

public class Main {
    public static void main(String[] args) {

        /*
        Example 1:
Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paperbag Added: 20
Total Price: 470
         */
        Pizza pizza1 = new Pizza(true);
        pizza1.addExtraCheese();
        pizza1.addExtraCheese();
        pizza1.addExtraCheese();
        pizza1.addExtraCheese();
        pizza1.addExtraCheese();
        pizza1.addExtraToppings(true);
        pizza1.addExtraToppings(true);
        pizza1.addExtraToppings(true);
        pizza1.addExtraToppings(true);
        pizza1.addTakeAway();
        pizza1.totalBill();

        DeluxePizza pizza2 = new DeluxePizza(false);
        pizza2.totalBill();

    }
}