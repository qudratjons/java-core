package com.company.regex;

/*
 1) "." (dot) - it can be any character;
 2) "[a-z]" - it can be from a to z only in lowercase letters
 3) "[a-zA-Z]" - lower and uppercase letter;
 4) "\d" - only digit
 5) "\D" - everything but numbers (not number)
 6) "\s" - only space
 7) "\S" - everything but a space (no space)
 8) "\w" - only letters, digits and _
 9) "\W" - no letters, digits and _
 10) "&&" - and operator
 11) "^" - should not contain character, example: "^_", [\w&&[^_]] is equal [a-zA-Z0-9]

 */
public class Regex {
    public static void main(String[] args) {

        String s = "Java";

        if (s.matches("J[a-zA-Z0-9].a"))
            System.out.println("Matches");
        else
            System.out.println("Not matches");

    }
}
