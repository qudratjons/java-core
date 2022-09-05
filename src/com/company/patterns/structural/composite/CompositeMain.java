package com.company.patterns.structural.composite;

import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();

        imageEditor.load();

        imageEditor.groupSelected(List.of(new Dot(77,99)));
    }
}
