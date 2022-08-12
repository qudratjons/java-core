package com.company.patterns.creational.abstractfactory;

import java.util.Random;

public class AbstractFactoryClientSide {

    //Abstract factory is object.
    public static void main(String[] args) {
        GUIFactory guiFactory;

        if (new Random().nextBoolean())
            guiFactory = new WinFactory();
        else
            guiFactory = new MacFactory();

        Application application = new Application(guiFactory);

        application.printUI();
    }
}
