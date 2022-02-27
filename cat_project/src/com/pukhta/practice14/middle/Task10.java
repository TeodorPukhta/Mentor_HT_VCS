package com.pukhta.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    private Task10() {
    }

    public static List<Character> getSortedLastLettersInUpperCase(List<String> stringList) {
        return stringList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())

                )
                .map(s -> Character.toUpperCase(s.charAt(s.length() - 1)))
                .collect(Collectors.toList());
    }
}