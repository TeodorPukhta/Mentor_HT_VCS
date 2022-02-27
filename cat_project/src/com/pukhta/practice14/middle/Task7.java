package com.pukhta.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 {
    private Task7() {
    }

    public static List<Integer> getSortedDifferenceBetweenSubsets(int number, List<Integer> integerList) {
        return Stream.concat(
                        (integerList.stream()
                                .filter(n -> n % 2 == 0)
                                .filter(n -> !(integerList.stream()
                                        .skip(number)
                                        .collect(Collectors.toList()))
                                        .contains(n))
                        ),
                        (integerList.stream()
                                .skip(number)
                                .filter(n -> !(integerList.stream()
                                        .filter(i -> i % 2 == 0)
                                        .collect(Collectors.toList()))
                                        .contains(n))
                        ))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}