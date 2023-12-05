package com.driver;

public class Pizza {

    // regular and deluxe pizza and both have veg and non-veg variants

    /*
    Veg pizza base price = 300
Non-veg pizza base price = 400
    Extra Cheese Price = 80
Extra Toppings For Veg Pizza = 70
Extra Toppings For Non-veg Pizza = 120
Paper bag Price = 20
     */
    private int price;
    private boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    private static int extraCheeseOnce = 0;
    private static int extraToppingsOnce = 0;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void addExtraCheese() {
        extraCheeseOnce++;
        if(extraCheeseOnce>1){
            return;
        }
        this.price += 80;
        extraCheese = true;
    }

    public void addExtraToppings(boolean isVeg) {
        extraToppingsOnce++;
        if(extraToppingsOnce>1){
            return;
        }

        extraToppings = true;
        this.isVeg = isVeg;
        if (isVeg) {
            this.price += 70;
        } else {
            this.price += 120;
        }

    }

    public void addTakeAway() {
        this.price += 20;
        takeAway = true;
    }

    public void totalBill() {
        if (isVeg) {
            System.out.println("Base Price Of The Pizza: 300");
        } else {
            System.out.println("Base Price Of The Pizza: 400");
        }

        if (extraCheese) {
            System.out.println("Extra Cheese Added: 80");
        }
        if (extraToppings) {
            if (isVeg) {
                System.out.println("Extra Toppings Added = 70");
            } else {
                System.out.println("Extra Toppings Added = 120");
            }
        }
        if (takeAway) {
            System.out.println("Paperbag Added = 20");
        }
        System.out.println("Total Price: " + price);
    }


}

