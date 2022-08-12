package com.company.patterns.creational.abstractfactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void printUI() {
        button.paint();
        checkbox.paint();
    }
}
