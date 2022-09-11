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

   Number of characters
 1) "*" - from zero to infinity
 2) "+" - from one to infinity
 3) "?" - 0 times or 1 times
 4) "{n}" - n times
 5) "{n,}" - minimum n times maximum is infinity;
 5) "{n,m}" - minimum n times maximum is m;
 */
public class Regex {

    private static final String REGEX = "[.\\D]*Java.*";
    public static void main(String[] args) {
        String s = "sdsdvczJava";

        if (s.matches(REGEX))
            System.out.println("Matches");
        else
            System.out.println("Not matches");

    }
}
