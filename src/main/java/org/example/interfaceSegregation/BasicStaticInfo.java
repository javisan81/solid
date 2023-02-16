package org.example.interfaceSegregation;

import java.util.Objects;

public class BasicStaticInfo {
    private final int popularity;

    public BasicStaticInfo(int popularity) {
        this.popularity = popularity;
    }

    public int getPopularity() {
        return popularity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicStaticInfo that = (BasicStaticInfo) o;
        return popularity == that.popularity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(popularity);
    }

    @Override
    public String toString() {
        return "BasicStaticInfo{" +
                "popularity=" + popularity +
                '}';
    }
}
