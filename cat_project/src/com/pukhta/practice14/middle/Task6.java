package com.pukhta.practice14.middle;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    private Task6() {
    }

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {
        return numbers.stream()
                .map(n -> stringList.stream()
                        .filter(s -> s.matches("^\\d.{" + (n - 1) + "}"))
                        .findFirst()
                        .orElse("Not Found"))
                .collect(Collectors.toList());
    }
}
