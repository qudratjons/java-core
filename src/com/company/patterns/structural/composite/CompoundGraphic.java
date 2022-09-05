package com.company.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> children = new ArrayList<>();

    public boolean addComponent(Graphic graphic) {
        return children.add(graphic);
    }

    public void removeComponent(Graphic graphic) {
        children.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        this.children.forEach(s -> s.move(x, y));
    }

    @Override
    public void draw() {
        this.children.forEach(Graphic::draw);
    }
}
