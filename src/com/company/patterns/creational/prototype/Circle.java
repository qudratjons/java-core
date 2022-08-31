package com.company.patterns.creational.prototype;

import java.util.Objects;

public class Circle extends Shape implements Cloneable {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    private Circle(Circle circle) {
        super(circle);
        this.radius = circle.radius;
    }

    @Override
    public Shape cloneObject() throws NullPointerException {
        return new Circle(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
