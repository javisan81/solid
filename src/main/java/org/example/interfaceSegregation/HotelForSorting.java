package org.example.interfaceSegregation;

import java.util.Objects;

public class HotelForSorting implements PopularHotel{
    private int popularity;

    public HotelForSorting(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public int getPopularity() {
        return popularity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelForSorting that = (HotelForSorting) o;
        return popularity == that.popularity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(popularity);
    }
}
