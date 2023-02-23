package org.example.interfaceSegregation;

import java.math.BigDecimal;
import java.util.List;

public class BudgetFilter {
    private final BigDecimal minBudget;
    private final BigDecimal maxBudget;

    public BudgetFilter(BigDecimal minBudget, BigDecimal maxBudget) {
        this.minBudget = minBudget;
        this.maxBudget = maxBudget;
    }

    public boolean passes(List<FilterByPriceHotel> hotels){
        if(hotels.isEmpty())
            return true;
        return hotels.stream()
                .anyMatch(h -> h.isPriceInBudget(minBudget, maxBudget));
    }
}
