package org.example.interfaceSegregation;

import java.math.BigDecimal;

public class MealPlan {
    private final String name;
    private final BigDecimal price;

    public MealPlan(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
