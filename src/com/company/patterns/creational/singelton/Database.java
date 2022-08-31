package com.company.patterns.creational.singelton;

import java.util.List;

public class Database {

    private static Database db;

    public static synchronized Database getInstance() {
        if (db == null)
            db = new Database();

        return db;
    }

    public List<String> getRecords() {
        return List.of("Hello", "world");
    }
}
