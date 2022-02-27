package com.pukhta.practice7;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Deposit deposit = new BaseDeposit(new BigDecimal(1000),3);
        System.out.println("res base: " + deposit.income().toPlainString());
        Deposit deposit1 = new LongDeposit(new BigDecimal(3000),8);
        System.out.println("res long: " + deposit1.income());
    }
}
