package org.example.interfaceSegregation;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BudgetFilterTest {
    @Test
    public void emptyList() {
        BudgetFilter budgetFilter = new BudgetFilter(BigDecimal.ZERO, BigDecimal.ZERO);
        assertTrue(budgetFilter.passes(Collections.emptyList()));
    }

    @Test
    public void oneMealPlanMinBudget() {
        BudgetFilter budgetFilter = new BudgetFilter(new BigDecimal(30), new BigDecimal(100));
        assertTrue(budgetFilter.passes(Collections.singletonList(new Hotel(null, Collections.singletonList(new MealPlan(null, new BigDecimal(30))), null))));
    }

    @Test
    public void oneMealPlanMaxBudget() {
        BudgetFilter budgetFilter = new BudgetFilter(new BigDecimal(30), new BigDecimal(100));
        assertTrue(budgetFilter.passes(Collections.singletonList(new Hotel(null, Collections.singletonList(new MealPlan(null, new BigDecimal(100))), null))));
    }

    @Test
    public void oneMealPlanInsideTheBudget() {
        BudgetFilter budgetFilter = new BudgetFilter(new BigDecimal(30), new BigDecimal(100));
        assertTrue(budgetFilter.passes(Collections.singletonList(new Hotel(null, Collections.singletonList(new MealPlan(null, new BigDecimal(50))), null))));
    }

    @Test
    public void oneMealPlanOutsideTheBudget() {
        BudgetFilter budgetFilter = new BudgetFilter(new BigDecimal(30), new BigDecimal(100));
        assertFalse(budgetFilter.passes(Collections.singletonList(new Hotel(null, Collections.singletonList(new MealPlan(null, new BigDecimal(110))), null))));
    }

    @Test
    public void twoMealPlansOneInsideOneOutsideTheBudget() {
        BudgetFilter budgetFilter = new BudgetFilter(new BigDecimal(30), new BigDecimal(100));
        assertTrue(budgetFilter.passes(Collections.singletonList(new Hotel(null, Arrays.asList(new MealPlan(null, new BigDecimal(110)), new MealPlan(null, new BigDecimal(50))), null))));
    }
}

