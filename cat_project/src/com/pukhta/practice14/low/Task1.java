package com.pukhta.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    private Task1() {
    }

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(s -> (s.length() > 1 && s.startsWith(String.valueOf(symbol)) && s.endsWith(String.valueOf(symbol))))
                .collect(Collectors.toList());
    }

}
