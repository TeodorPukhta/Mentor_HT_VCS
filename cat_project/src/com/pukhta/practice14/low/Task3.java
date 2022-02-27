package com.pukhta.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    private Task3() {
    }

    public static List<String> getListExtremeLetters(List<String> list) {
        return list.stream()
                .map(s -> String.valueOf(s.charAt(0)) + s.charAt(s.length() - 1))
                .collect(Collectors.toList());
    }
}
