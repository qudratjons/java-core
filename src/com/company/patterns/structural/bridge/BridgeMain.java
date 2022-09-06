package com.company.patterns.structural.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Shape square = new Square(new Blue());
        System.out.println(square.draw());

        square.color = new Red();

        System.out.println(square.draw());
    }

}
