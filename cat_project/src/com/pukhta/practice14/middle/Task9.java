package com.pukhta.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    private Task9() {
    }

    public static List<String> shouldReturnStringListWithLengthAndFirstLetter(List<String> stringList) {
        return stringList.stream()
                .map(s -> String.valueOf(s.charAt(0)))
                .distinct()
                .map(s -> stringList.stream()
                        .filter(s1 -> s1.startsWith(s))
                        .mapToInt(String::length)
                        .sum() + "-" + s
                )
                .sorted(Comparator.comparingInt((String s) -> Integer.parseInt(s.split("-")[0])).reversed().thenComparing((String s) -> (s.split("-")[1])))
                .collect(Collectors.toList());
    }
}
