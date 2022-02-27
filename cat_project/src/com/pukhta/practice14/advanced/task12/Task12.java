package com.pukhta.practice14.advanced.task12;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    private Task12() {
    }

    public static List<NumberPair> makeNumberPairsFromTwoList(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .map(number -> new NumberPair(number, list2.stream()
                        .filter(exp -> exp % 10 == number % 10)
                        .findAny()
                        .orElse(-1)))
                .filter(pair -> pair.getValue2() >= 0)
                .sorted(Comparator.comparing(NumberPair::getValue1).thenComparing(NumberPair::getValue2))
                .collect(Collectors.toList());
    }
}
