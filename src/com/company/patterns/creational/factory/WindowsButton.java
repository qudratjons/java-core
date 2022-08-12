package com.company.patterns.creational.factory;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Inside WindowsButton.render");
    }

    @Override
    public void onclick() {
        System.out.println("Inside WindowsButton.onclick");
    }
}
