package com.company.regex;

import java.util.Scanner;

public class RegexExamples {

    public static void main(String[] args) {
        try {
            System.out.print("Please enter secret code:");
            if (new Scanner(System.in).nextInt() != 1232)
                throw new Exception("Password not matched");

            System.out.println("=================>\n");
            System.out.println("Started hacking Nasa...");
            Thread.sleep(500);
            System.out.println("Searching Nasa's secret database");
            Thread.sleep(2000);
            System.out.println("Connecting to Nasa database..");
            Thread.sleep(500);
            System.out.println("Cleaning up the database...");
            Thread.sleep(2000);
            System.out.println("Found 5 secret files...");
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("File " + i + " successfully deleted!");
            }
            Thread.sleep(2000);
            System.out.println("Closing http connection...");
            Thread.sleep(1000);
            System.out.println("You hacked Nasa successfully.");
        } catch (Exception e) {
          try{
              System.out.println("Secret key is not matched..");
              Thread.sleep(1000);
              System.out.println("Activated Nasa security system...");
              Thread.sleep(2000);
              System.out.println("FBI now knows your location");
              System.out.println("Run ");
          } catch (Exception ex){ex.printStackTrace();}
        }
    }
}
