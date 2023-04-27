package com.driver;

public class Pizza {

    /*
    Veg pizza base price = 300
    Non-veg pizza base price = 400
    Extra Cheese Price = 80
    Extra Toppings For Veg Pizza = 70
    Extra Toppings For Non-veg Pizza = 120
    Paper bag Price = 20
     */
    private int price;
    private int paperBag;
    private int basePrice;
    private int toppings;
    private int cheesePrice;
    private int vegTopping;
    private int nonvegTopping;
    private int takeaway;

    private Boolean isVeg;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeaway;

    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice = isVeg ? 300 : 400;
        this.price = basePrice;
        paperBag = 20;
        vegTopping = 70;
        nonvegTopping = 120;
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeaway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if( !isCheeseAdded ){
            isCheeseAdded = true;
            cheesePrice = 80;
            price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if( !isToppingAdded ){
            isToppingAdded = true;
            toppings = isVeg ? vegTopping : nonvegTopping;
            price += toppings;
        }
    }

    public void addTakeaway(){
        if( !isTakeaway ){
            isTakeaway = true;
            takeaway = 20;
            price += takeaway;
        }
    }

    public String getBill(){
        String tempBill = "";
        tempBill += "Base Price Of The Pizza: " + basePrice + "\n";
        if( isCheeseAdded ){
            tempBill += "Extra Cheese Added: " + cheesePrice + "\n";
        }
        if( isToppingAdded ){
            tempBill += "Extra Toppings Added: " + toppings + "\n";
        }
        if( isTakeaway ){
            tempBill += "Paperbag Added: " + paperBag + "\n";
        }
        tempBill += "Total Price: " + price + "\n";
        this.bill = tempBill;
        return this.bill;
    }
}
/*
Base Price Of The Pizza: 300
Extra Cheese Added: 80
Extra Toppings Added: 70
Paperbag Added: 20
Total Price: 470
 */
