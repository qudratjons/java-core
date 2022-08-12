package com.company.patterns.creational.factory;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Inside HTMLButton.render");
    }

    @Override
    public void onclick() {
        System.out.println("Inside HTMLButton.onclick");
    }
}
