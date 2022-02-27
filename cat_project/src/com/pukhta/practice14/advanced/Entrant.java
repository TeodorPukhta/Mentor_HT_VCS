package com.pukhta.practice14.advanced;

public class Entrant {

    private int schoolNumber;
    private int yearOfEntering;
    private String lastName;

    public Entrant() {
    }

    public Entrant(int schoolNumber, int yearOfEntering, String lastName) {
        this.schoolNumber = schoolNumber;
        this.yearOfEntering = yearOfEntering;
        this.lastName = lastName;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public int getYearOfEntering() {
        return yearOfEntering;
    }

    public void setYearOfEntering(int yearOfEntering) {
        this.yearOfEntering = yearOfEntering;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entrant)) return false;

        Entrant entrant = (Entrant) o;

        if (getSchoolNumber() != entrant.getSchoolNumber()) return false;
        if (getYearOfEntering() != entrant.getYearOfEntering()) return false;
        return getLastName() != null ? getLastName().equals(entrant.getLastName()) : entrant.getLastName() == null;
    }

    @Override
    public int hashCode() {
        int result = getSchoolNumber();
        result = 31 * result + getYearOfEntering();
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entrant{" +
                "schoolNumber=" + schoolNumber +
                ", yearOfEntering=" + yearOfEntering +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
