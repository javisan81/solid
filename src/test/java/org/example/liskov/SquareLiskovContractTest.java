package org.example.liskov;

public class SquareLiskovContractTest extends LiskovContractTest{
    @Override
    protected Rectangle createRectangle() {
        return new Square(1);
    }
}
