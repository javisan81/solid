package org.example.liskov;

public class Square extends Rectangle{
    public Square(int length) {
        super(length, length);
    }

    @Override
    public void changeHeight(int length) {
        super.changeHeight(length);
        super.changeWidht(length);
    }

    @Override
    public void changeWidht(int lenght) {
        super.changeWidht(lenght);
        super.changeHeight(lenght);
    }
}
