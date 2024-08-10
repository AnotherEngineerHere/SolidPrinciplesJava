package com.solid.ocp;

/**
 * Interfaz que define una política de descuento.
 * 
 * author TuNombre
 */
public interface DiscountPolicy {
    double applyDiscount(double price);
}
