package com.pukhta.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    private Task5() {
    }

    public static List<String> getSortedAscOddValues(List<Integer> intList) {

        return intList.stream()
                .filter(n -> n % 2 != 0)
                .map(String::valueOf)
                .sorted()
                .collect(Collectors.toList());
    }
}
