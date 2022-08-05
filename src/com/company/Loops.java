package com.company;

public class Loops {
    public static void main(String[] args) {
        WConsoleBanner.writeOnTheConsole();

        strangerPattern();
        shiftNum();

    }

    public static void strangerPattern() {
        int coe = 1; int rows = 6;
        for (int i = 0; i < rows; i++){
            for (int space = 1; space < rows - i; ++space) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coe = 1;
                else
                    coe = coe * (i - j + 1) / j;

                System.out.printf("%4d", coe);
            }
            System.out.println();
        }
        System.out.println();
    }


    private static void drawRomb() {
        triangleUp();
        System.out.println("*******************");
        triangleDown();
        System.out.println();
    }

    private static void shiftNum() {
        for (int i = 0; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" " +j);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" " +k);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void triangleUp() {
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void triangleDown() {
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

}
