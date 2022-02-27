package com.pukhta.practice14.advanced.task14;

public class SupplierDiscount {

    private int customerId;
    private int discountPercentage;
    private String storeName;

    public SupplierDiscount() {
    }

    public SupplierDiscount(int customerId, int discountPercentage, String storeName) {
        this.customerId = customerId;
        this.discountPercentage = discountPercentage;
        this.storeName = storeName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierDiscount)) return false;

        SupplierDiscount that = (SupplierDiscount) o;

        if (getCustomerId() != that.getCustomerId()) return false;
        if (getDiscountPercentage() != that.getDiscountPercentage()) return false;
        return getStoreName() != null ? getStoreName().equals(that.getStoreName()) : that.getStoreName() == null;
    }

    @Override
    public int hashCode() {
        int result = getCustomerId();
        result = 31 * result + getDiscountPercentage();
        result = 31 * result + (getStoreName() != null ? getStoreName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SupplierDiscount{" +
                "customerId=" + customerId +
                ", discountPercentage=" + discountPercentage +
                ", storeName='" + storeName + '\'' +
                '}';
    }
}
