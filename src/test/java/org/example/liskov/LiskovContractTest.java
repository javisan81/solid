package org.example.liskov;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class LiskovContractTest {
    @Test
    public void liskovPrinciple() {
        Rectangle rectangle = createRectangle();
        rectangle.changeHeight(10);
        rectangle.changeWidht(20);
        assertEquals(10, rectangle.getHeight());
        assertEquals(20, rectangle.getWidth());
    }
    protected abstract Rectangle createRectangle();
}
