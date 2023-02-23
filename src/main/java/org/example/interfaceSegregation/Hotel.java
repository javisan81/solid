package org.example.interfaceSegregation;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Hotel implements FilterByPriceHotel, PopularHotel {
    private final String hotelId;
    private final List<MealPlan> mealPlans;
    private final BasicStaticInfo staticInfo;

    public Hotel(String hotelId, List<MealPlan> mealPlans, BasicStaticInfo staticInfo) {
        this.hotelId = hotelId;
        this.mealPlans = mealPlans;
        this.staticInfo = staticInfo;
    }
    public boolean isPriceInBudget(BigDecimal minBudget, BigDecimal maxBudget){
        return mealPlans.stream().anyMatch(m -> m.getPrice().compareTo(maxBudget) <= 0 && m.getPrice().compareTo(minBudget) >= 0);
    }

    public int getPopularity(){
        return staticInfo.getPopularity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(hotelId, hotel.hotelId) && Objects.equals(mealPlans, hotel.mealPlans) && Objects.equals(staticInfo, hotel.staticInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelId, mealPlans, staticInfo);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId='" + hotelId + '\'' +
                ", mealPlans=" + mealPlans +
                ", staticInfo=" + staticInfo +
                '}';
    }
}
