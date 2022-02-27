package com.pukhta.practice14.advanced;

public class YearSchoolStat {

    private int yearOfEntering;
    private int numberOfSchools;

    public YearSchoolStat() {
    }

    public YearSchoolStat(int yearOfEntering, int numberOfSchools) {
        this.yearOfEntering = yearOfEntering;
        this.numberOfSchools = numberOfSchools;
    }

    public int getYearOfEntering() {
        return yearOfEntering;
    }

    public void setYearOfEntering(int yearOfEntering) {
        this.yearOfEntering = yearOfEntering;
    }

    public int getNumberOfSchools() {
        return numberOfSchools;
    }

    public void setNumberOfSchools(int numberOfSchools) {
        this.numberOfSchools = numberOfSchools;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof YearSchoolStat)) return false;

        YearSchoolStat that = (YearSchoolStat) o;

        if (getYearOfEntering() != that.getYearOfEntering()) return false;
        return getNumberOfSchools() == that.getNumberOfSchools();
    }

    @Override
    public int hashCode() {
        int result = getYearOfEntering();
        result = 31 * result + getNumberOfSchools();
        return result;
    }

    @Override
    public String toString() {
        return "("+ yearOfEntering + ", " +
                numberOfSchools +
                ")";
    }
}
