package com.company.patterns.creational.factory;

import java.util.Random;

public class FactoryClientSide {
    //  Factory is method.
    public static void main(String[] args) {
        Dialog dialog;

        if (new Random().nextBoolean())
            dialog = new WebDialog();
        else
            dialog = new WindowsDialog();

        dialog.render();
    }
}
