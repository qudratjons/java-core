package com.company.patterns.creational.prototype;

public class Prototype {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Shape shape = circle.cloneObject();

        System.out.println(shape == circle);
        System.out.println(shape.hashCode());
        System.out.println(circle.hashCode());
    }
}
