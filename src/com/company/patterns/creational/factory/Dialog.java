package com.company.patterns.creational.factory;

public abstract class Dialog {

    public void render() {
        Button okButton = createButton();
        okButton.onclick();
        okButton.render();

    }

    public abstract Button createButton();

}
