package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    private static final int FIRST_DISCOUNT_LOWER_LIMIT = 100;
    private static final int FIRST_DISCOUNT_HIGHER_LIMIT = 150;
    private static final int SECOND_DISCOUNT_LOWER_LIMIT = 150;
    private static final int SECOND_DISCOUNT_HIGHER_LIMIT = 400;
    private static final double FIRST_DISCOUNT = 0.8;
    private static final double SECOND_DISCOUNT = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= FIRST_DISCOUNT_LOWER_LIMIT && cumulativeExpensesThisMonth < FIRST_DISCOUNT_HIGHER_LIMIT) {
            return originalPrice * FIRST_DISCOUNT;
        }
        if (cumulativeExpensesThisMonth >= SECOND_DISCOUNT_LOWER_LIMIT && cumulativeExpensesThisMonth < SECOND_DISCOUNT_HIGHER_LIMIT) {
            return originalPrice * SECOND_DISCOUNT;
        }
        return originalPrice;
    }
}
