package com.pukhta.practice14.advanced.task15;

public class Good {

    private int productSKU;
    private String category;
    private String countryOfOrigin;

    public Good(final int productSKU, final String category, final String countryOfOrigin) {
        this.productSKU = productSKU;
        this.category = category;
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(final int productSKU) {
        this.productSKU = productSKU;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(final String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
