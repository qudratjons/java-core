package com.company.patterns.creational.prototype;

public class Rectangle extends Shape{
    int width;
    int height;

    private Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(this);
    }
}
