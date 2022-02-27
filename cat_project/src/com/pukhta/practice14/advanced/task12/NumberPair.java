package com.pukhta.practice14.advanced.task12;

import java.util.Objects;

public class NumberPair {

    private int value1;
    private int value2;

    public NumberPair(final int value1, final int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(final int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(final int value2) {
        this.value2 = value2;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final NumberPair that = (NumberPair) o;
        return value1 == that.value1 &&
                value2 == that.value2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
}
