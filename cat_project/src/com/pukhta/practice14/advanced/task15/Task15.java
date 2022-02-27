package com.pukhta.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task15 {
    private Task15() {
    }

    public static List<CountryStat> name(List<Good> goodList, List<StorePrice> storePriceList) {
        return goodList.stream()
                .filter(distinctByKey(Good::getCountryOfOrigin))
                .map(good -> new CountryStat(good.getCountryOfOrigin(),
                        storePriceList.stream()
                                .filter(store -> store.getProductSKU() == good.getProductSKU())
                                .count()


                        , storePriceList.stream()
                        .sorted(Comparator.comparing(StorePrice::getPrice))
                        .filter(store -> store.getProductSKU() == good.getProductSKU())
                        .map(StorePrice::getPrice)
                        .findFirst().orElse(BigDecimal.ZERO)

                ))
                .collect(Collectors.toList());
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}