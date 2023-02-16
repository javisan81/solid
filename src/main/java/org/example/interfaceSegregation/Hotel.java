package org.example.interfaceSegregation;

import java.util.List;
import java.util.Objects;

public class Hotel {
    private final String hotelId;
    private final List<MealPlan> mealPlans;
    private final BasicStaticInfo staticInfo;

    public Hotel(String hotelId, List<MealPlan> mealPlans, BasicStaticInfo staticInfo) {
        this.hotelId = hotelId;
        this.mealPlans = mealPlans;
        this.staticInfo = staticInfo;
    }

    public BasicStaticInfo getStaticInfo() {
        return staticInfo;
    }

    public List<MealPlan> getMealPlans() {
        return mealPlans;
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
