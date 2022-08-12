package com.company.patterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Inside MacCheckbox.paint");
    }
}
