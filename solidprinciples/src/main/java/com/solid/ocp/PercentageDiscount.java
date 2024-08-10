package com.solid.ocp;

/**
 * Implementación de un descuento porcentual.
 * 
 * author Andres Orozco
 */
public class PercentageDiscount implements DiscountPolicy {

    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - (price * percentage);
    }
}