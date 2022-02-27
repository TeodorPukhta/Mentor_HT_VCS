package com.pukhta.practice14.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task14 {
    private Task14() {
    }

    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        return supplierDiscountList.stream()
                .sorted(Comparator.comparing(SupplierDiscount::getDiscountPercentage).reversed().thenComparing(SupplierDiscount::getCustomerId))
                .filter(distinctByKey(SupplierDiscount::getStoreName))
                .map(s -> new ShopWithMaxDiscountOwner(s.getStoreName(), supplierList.stream()
                        .filter(sup -> sup.getCustomerId() == s.getCustomerId())
                        .findFirst().orElse(null)
                ))
                .collect(Collectors.toList());
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
