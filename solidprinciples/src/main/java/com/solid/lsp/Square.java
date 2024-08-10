package com.solid.lsp;
/**
 * Clase que representa un cuadrado.
 * 
 * author Andres Orozco
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}