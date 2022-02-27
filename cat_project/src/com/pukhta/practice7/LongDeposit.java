package com.pukhta.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit {
    private final BigDecimal incomePercent = new BigDecimal(15);

    public LongDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        dataValidation(getAmount(), getPeriod());
        if (getPeriod() < 7) return BigDecimal.ZERO;
        BigDecimal tmp;
        BigDecimal res = BigDecimal.ZERO;
        BigDecimal sum = getAmount();
        for (int i = 7; i <= getPeriod(); i++) {
            tmp = sum;
            sum = sum.add(percentage(sum, incomePercent));
            res = res.add(sum.subtract(tmp));
        }
        return res.setScale(2, RoundingMode.HALF_EVEN);
    }
}