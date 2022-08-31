package com.company.patterns.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(bugattiVeyronAdapter.getSpeed());
    }
}
