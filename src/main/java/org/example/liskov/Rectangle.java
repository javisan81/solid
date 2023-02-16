package org.example.liskov;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void changeWidht(int newWidth) {
        this.width = newWidth;
    }

    public void changeHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
