package com.pukhta.practice14.advanced.task15;

import java.math.BigDecimal;
import java.util.Objects;

public class CountryStat {

    private String countryOfOrigin;
    private long numberOfStores;
    private BigDecimal minimumPrice;

    public CountryStat(final String countryOfOrigin, final long numberOfStores, final BigDecimal minimumPrice) {
        this.countryOfOrigin = countryOfOrigin;
        this.numberOfStores = numberOfStores;
        this.minimumPrice = minimumPrice;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(final String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public long getNumberOfStores() {
        return numberOfStores;
    }

    public void setNumberOfStores(final long numberOfStores) {
        this.numberOfStores = numberOfStores;
    }

    public BigDecimal getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(final BigDecimal minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountryStat that = (CountryStat) o;
        return numberOfStores == that.numberOfStores && Objects.equals(countryOfOrigin, that.countryOfOrigin) && Objects.equals(minimumPrice, that.minimumPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryOfOrigin, numberOfStores, minimumPrice);
    }
}
