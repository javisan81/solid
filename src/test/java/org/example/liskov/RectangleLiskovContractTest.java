package org.example.liskov;

public class RectangleLiskovContractTest extends LiskovContractTest{
    @Override
    protected Rectangle createRectangle() {
        return new Rectangle(1,1);
    }
}
