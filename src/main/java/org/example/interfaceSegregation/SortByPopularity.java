package org.example.interfaceSegregation;

import java.util.List;
import java.util.stream.Collectors;

public class SortByPopularity{
    public List<Hotel> sort(List<Hotel> hotels){
        return hotels.stream()
                .sorted((a,b) -> b.getStaticInfo().getPopularity() - a.getStaticInfo().getPopularity()).collect(Collectors.toList());
    }
}
