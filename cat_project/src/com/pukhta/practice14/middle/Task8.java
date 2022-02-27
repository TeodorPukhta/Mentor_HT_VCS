package com.pukhta.practice14.middle;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task8 {
    private Task8() {
    }

    public static List<Integer> getSortedUnionTwoSubsetsIntegers(int d, int k, List<Integer> intList) {
//        return Stream.concat(
//                        (intList.stream()
//                                .filter(n -> n > d)
//                        ),
//                        (intList.stream()
//                                .skip(k - 1)
//                        ))
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
        return Stream.concat(
                        (intList.stream()
                                .filter(n -> n > d)
                        ),
                        (intList.stream()
                                .skip(k - 1)
                        ))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
