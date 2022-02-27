package com.pukhta.practice14.advanced.task15;

import java.math.BigDecimal;

public class StorePrice {

    private int productSKU;
    private String storeTitle;
    private BigDecimal price;

    public StorePrice(final int productSKU, final String storeTitle, final BigDecimal price) {
        this.productSKU = productSKU;
        this.storeTitle = storeTitle;
        this.price = price;
    }

    public int getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(final int productSKU) {
        this.productSKU = productSKU;
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public void setStoreTitle(final String storeTitle) {
        this.storeTitle = storeTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
}
