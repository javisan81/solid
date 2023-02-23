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
                        new HotelForSorting(75),
                        new HotelForSorting(50)
                ),
                sortByPopularity.sort(Arrays.asList(
                                new HotelForSorting(50),
                                new HotelForSorting(75)
                        )
                )
        );
    }
}