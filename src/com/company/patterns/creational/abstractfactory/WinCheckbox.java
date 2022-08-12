package com.company.patterns.creational.abstractfactory;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Inside WinCheckbox.paint");
    }
}
