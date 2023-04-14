package com.driver;

public class DeluxePizza extends Pizza {
    private String getBill;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        super.addTakeaway();
        this.getBill = super.getBill();
    }
}
