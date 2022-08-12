package com.company.patterns.creational.abstractfactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Inside WinButton.paint");
    }
}
