package com.company;

interface B<T, R> {
   R add(T t);
}

public class Test {
    public static void main(String[] args) {
        Integer hello_world = getStringLength("", String::length);

        System.out.println(hello_world);
    }
    private static <T, R> R getStringLength(T t, B<T, R> b) {
        return b.add(t);
    }
}