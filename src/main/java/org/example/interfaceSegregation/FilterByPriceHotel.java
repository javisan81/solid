package org.example.interfaceSegregation;

import java.math.BigDecimal;

public interface FilterByPriceHotel {
     boolean isPriceInBudget(BigDecimal minBudget, BigDecimal maxBudget);
}
