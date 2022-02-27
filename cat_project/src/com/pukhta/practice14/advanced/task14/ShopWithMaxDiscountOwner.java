package com.pukhta.practice14.advanced.task14;

public class ShopWithMaxDiscountOwner {

    private String storeName;
    private Supplier supplier;

    public ShopWithMaxDiscountOwner() {
    }

    public ShopWithMaxDiscountOwner(String storeName, Supplier supplier) {
        this.storeName = storeName;
        this.supplier = supplier;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopWithMaxDiscountOwner)) return false;

        ShopWithMaxDiscountOwner that = (ShopWithMaxDiscountOwner) o;

        if (getStoreName() != null ? !getStoreName().equals(that.getStoreName()) : that.getStoreName() != null)
            return false;
        return getSupplier() != null ? getSupplier().equals(that.getSupplier()) : that.getSupplier() == null;
    }

    @Override
    public int hashCode() {
        int result = getStoreName() != null ? getStoreName().hashCode() : 0;
        result = 31 * result + (getSupplier() != null ? getSupplier().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopWithMaxDiscountOwner{" +
                "storeName='" + storeName + '\'' +
                ", supplier=" + supplier +
                '}';
    }
}
