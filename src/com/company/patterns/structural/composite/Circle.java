package com.company.patterns.structural.composite;

public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.format("x: %s, y: %s, radius: %s", x, y, radius);
    }
}
