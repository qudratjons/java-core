package com.company.patterns.creational.singelton;

public class SingletonMain {

    public static void main(String[] args) {
        Database instance = Database.getInstance();
        System.out.println(instance.getRecords());

        Database instance2 = Database.getInstance();
        System.out.println(instance2.getRecords());

        System.out.println("Is equals: " + instance.equals(instance2));
    }
}
