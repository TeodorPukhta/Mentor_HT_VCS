package com.pukhta.practice14.advanced.task14;

public class Supplier {

    private int customerId;
    private int yearOfBirth;
    private String streetOfResidence;

    public Supplier() {
    }

    public Supplier(int customerId, int yearOfBirth, String streetOfResidence) {
        this.customerId = customerId;
        this.yearOfBirth = yearOfBirth;
        this.streetOfResidence = streetOfResidence;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getStreetOfResidence() {
        return streetOfResidence;
    }

    public void setStreetOfResidence(String streetOfResidence) {
        this.streetOfResidence = streetOfResidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;

        Supplier supplier = (Supplier) o;

        if (getCustomerId() != supplier.getCustomerId()) return false;
        if (getYearOfBirth() != supplier.getYearOfBirth()) return false;
        return getStreetOfResidence() != null ? getStreetOfResidence().equals(supplier.getStreetOfResidence()) : supplier.getStreetOfResidence() == null;
    }

    @Override
    public int hashCode() {
        int result = getCustomerId();
        result = 31 * result + getYearOfBirth();
        result = 31 * result + (getStreetOfResidence() != null ? getStreetOfResidence().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "customerId=" + customerId +
                ", yearOfBirth=" + yearOfBirth +
                ", streetOfResidence='" + streetOfResidence + '\'' +
                '}';
    }
}
