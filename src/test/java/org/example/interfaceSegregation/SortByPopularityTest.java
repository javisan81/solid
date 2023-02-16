package org.example.interfaceSegregation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByPopularityTest {
    @Test
    public void emptyList() {
        SortByPopularity sortByPopularity = new SortByPopularity();
        assertEquals(Collections.emptyList(), sortByPopularity.sort(Collections.emptyList()));
    }

    @Test
    public void twoHotelDisordered() {
        SortByPopularity sortByPopularity = new SortByPopularity();
        assertEquals(
                Arrays.asList(
                        new Hotel(null, null, new BasicStaticInfo(75)),
                        new Hotel(null, null, new BasicStaticInfo(50))
                ),
                sortByPopularity.sort(Arrays.asList(
                                new Hotel(null, null, new BasicStaticInfo(50)),
                                new Hotel(null, null, new BasicStaticInfo(75))
                        )
                )
        );
    }
}