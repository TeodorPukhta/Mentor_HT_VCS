package com.pukhta.practice7;

import java.math.BigDecimal;

public abstract class Deposit {
    static final String WRONG_DATA = "Entered wrong data";
    public static final BigDecimal HUNDRED = new BigDecimal(100);
    public final BigDecimal amount;
    public final int period;

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        amount = depositAmount;
        period = depositPeriod;
    }

    public abstract BigDecimal income();

    public static BigDecimal percentage(BigDecimal base, BigDecimal pct) {
        return base.multiply(pct).divide(HUNDRED);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public static void dataValidation(int data) {

    }

    public static void dataValidation(BigDecimal amount, int period) {
        if (period <= 0) throw new IllegalArgumentException(WRONG_DATA);
        amount = (amount == null ? BigDecimal.ZERO : amount);
        if (amount.compareTo(BigDecimal.valueOf(0)) <= 0) throw new IllegalArgumentException(WRONG_DATA);
    }

}