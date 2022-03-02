package com.company;

import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        WConsoleBanner.writeOnTheConsole();

        fizzBuzz(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

    }

    // FIZZ BUZZ solution
    private static void fizzBuzz(List<Integer> integerList) {
        integerList
                .forEach(num -> {
                    if (num % 3 == 0 && num % 5 == 0) {
                        System.out.print(" FIZZ-BUZZ");
                    } else if (num % 3 == 0) {
                        System.out.print(" FIZZ");
                    } else if (num % 5 == 0) {
                        System.out.print(" BUZZ");
                    } else {
                        System.out.print(" " + num);
                    }
                    System.out.print(",");
                });
    }
}
