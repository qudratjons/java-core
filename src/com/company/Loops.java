package com.company;

public class Loops {
    public static void main(String[] args) {
        WConsoleBanner.writeOnTheConsole();

        triangleDown();
        triangleUp();
        shiftNum();
        drawRomb();

    }

    private static void drawRomb() {
        triangleUp();
        System.out.println("*******************");
        triangleDown();
    }

    private static void shiftNum() {
        for (int i = 0; i <= 9; i++) {
            for (int j = i; j <= 9 ; j++) {
                System.out.print(" " + j);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }

    private static void triangleUp() {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9 ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void triangleDown() {
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j <= 9 ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
