package com.pukhta.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    private Task4() {
    }

    public static List<String> filterAndSortByLastDigit(int number, List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.length() == number)
                .filter(s -> Character.isDigit(s.charAt(s.length() - 1)))
                .sorted()
                .collect(Collectors.toList());
    }
}