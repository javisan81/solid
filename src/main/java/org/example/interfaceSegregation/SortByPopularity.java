package org.example.interfaceSegregation;

import java.util.List;
import java.util.stream.Collectors;

public class SortByPopularity{
    public List<PopularHotel> sort(List<PopularHotel> hotels){
        return hotels.stream()
                .sorted((a,b) -> b.getPopularity() - a.getPopularity()).collect(Collectors.toList());
    }
}
