package com.company.patterns.structural.composite;

import java.util.List;

public class ImageEditor {

    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.addComponent(new Dot(1, 2));
        all.addComponent(new Circle(8, 10, 5));
    }

    public void groupSelected(List<Graphic> components) {

        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component : components) {
            group.addComponent(component);
            all.removeComponent(component);
        }
        all.addComponent(group);
        all.draw();
    }
}
