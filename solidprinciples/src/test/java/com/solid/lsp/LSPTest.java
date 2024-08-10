package com.solid.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LSPTest {

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        double area = rectangle.area();
        assertEquals(6.0, area);
    }

    @Test
    public void testSquareArea() {
        Rectangle square = new Square(2.0);
        double area = square.area();
        assertEquals(4.0, area);
    }
}
