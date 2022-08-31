package com.company.patterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    protected Shape() {
    }

    protected Shape(Shape shape) {
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape cloneObject();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }
}
