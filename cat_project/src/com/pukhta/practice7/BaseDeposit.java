package com.pukhta.practice7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BaseDeposit extends Deposit {
    private final BigDecimal incomePercent = new BigDecimal(5);

    public BaseDeposit(BigDecimal amount, int period) {
        super(amount, period);
    }

    @Override
    public BigDecimal income() {
        dataValidation(getAmount(), getPeriod());
        BigDecimal tmp;
        BigDecimal res = BigDecimal.ZERO;
        BigDecimal sum = getAmount();
        for (int i = 0; i < getPeriod(); i++) {
            tmp = sum;
            sum = sum.add(percentage(sum, incomePercent));
            res = res.add(sum.subtract(tmp));
        }
        return res.setScale(2, RoundingMode.HALF_EVEN);
    }
}