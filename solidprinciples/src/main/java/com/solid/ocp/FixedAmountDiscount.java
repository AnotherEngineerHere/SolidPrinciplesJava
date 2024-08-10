package com.solid.ocp;

/**
 * Implementación de un descuento fijo.
 * 
 * author Andres Orozco
 */
public class FixedAmountDiscount implements DiscountPolicy {

    private final double amount;

    public FixedAmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - amount;
    }
}