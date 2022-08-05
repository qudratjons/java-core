package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    public static void main(String[] args) {

        System.out.println(formatNumber(12378756.89900));

        System.out.printf("%-10s %s %n", "baeldung", "010");
    }

    public static String formatNumber(double number) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("uz", "uz"));
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("");
        formatter.setDecimalFormatSymbols(symbols);
        return formatter.format(number);
    }
}
