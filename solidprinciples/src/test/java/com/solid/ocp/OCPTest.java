package com.solid.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OCPTest {

    @Test
    public void testPercentageDiscount() {
        DiscountPolicy discount = new PercentageDiscount(0.1);
        double result = discount.applyDiscount(100.0);
        assertEquals(90.0, result);
    }

    @Test
    public void testFixedAmountDiscount() {
        DiscountPolicy discount = new FixedAmountDiscount(10.0);
        double result = discount.applyDiscount(100.0);
        assertEquals(90.0, result);
    }
}
