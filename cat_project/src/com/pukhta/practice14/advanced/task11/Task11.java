package com.pukhta.practice14.advanced.task11;

import com.epam.test.automation.java.practice14.advanced.Entrant;
import com.epam.test.automation.java.practice14.advanced.YearSchoolStat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    private Task11() {
    }
        public static List<YearSchoolStat> getYearSchoolStats(List<Entrant> entrantList) {
        return entrantList.stream()
                .map(entrant -> new YearSchoolStat(entrant.getYearOfEntering(),
                        (int) entrantList.stream()
                                .filter(e -> e.getYearOfEntering() == entrant.getYearOfEntering()
                                        && e.getSchoolNumber() != entrant.getSchoolNumber())
                                .count() + 1)
                )
                .distinct()
                .sorted(Comparator.comparing(YearSchoolStat::getNumberOfSchools).thenComparing(YearSchoolStat::getYearOfEntering))
                .collect(Collectors.toList());
    }
}
