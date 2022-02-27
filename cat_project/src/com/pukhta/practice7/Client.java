package com.pukhta.practice7;

import java.math.BigDecimal;

public class Client {
    private Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean addDeposit(Deposit deposit) {
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] == null) {
                deposits[i] = deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++) {
            if (deposits[i] != null)
                total = total.add(deposits[i].income());
        }
        return total;
    }

    public BigDecimal maxIncome() {
        BigDecimal max = BigDecimal.ZERO;
        for (int i = 0; i < deposits.length; i++) {
            if ((deposits[i] != null) && (max.compareTo(deposits[i].income()) <= 0))
                    max = deposits[i].income();
        }
        return max;
    }

    public BigDecimal getIncomeByNumber(int number) {
        if (number < 0 || number > 10) throw new IllegalArgumentException();
        if (deposits[number] == null) return BigDecimal.ZERO;
        return deposits[number].income();
    }
}