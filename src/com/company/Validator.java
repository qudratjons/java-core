package com.company;

import java.util.regex.Pattern;
public class Validator {

    public static final String PHONE_NUMBER_REGEX = "^(998)\\d{9}$";
    public static final String EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static final String HUMO_PAN_REGEXP = "(9860\\d{12})|(555536\\d{10})";
    public static final String HUMO_TOKEN_REGEX = "(9860\\d{2}[A-Z]{6}\\d{4})|(5555\\d{2}[A-Z]{6}\\d{4})";

    public static final String MASTER_CARD_PAN_REGEXP = "555536\\d{10}";
    public static final String MASTER_CARD_TOKEN_REGEX = "5555\\d{2}[A-Z]{6}\\d{4}";

    public static final String REAL_MASTERCARD_PAN_REGEXP = "547733\\d{10}";
    public static final String REAL_MASTERCARD_TOKEN_REGEXP = "^[0-9]{6,19}$";

    public static final String UZCARD_PAN_REGEXP = "8600\\d{12}";
    public static final String UZCARD_COBEDJ_PAN_REGEXP = "(6262\\d{12})|(6263\\d{12})|(6264\\d{12})|(5614\\d{12})|(5440\\d{12})";
    public static final String UZCARD_FOREIGN_REGEXP = "^(?=8600)(?!860063).*$";
    public static final String UZCARD_TOKEN_REGEXP = "[A-Z0-9]{32}|AAAAAAAAAA";

    public static final String TKB_TOKEN_REGEXP = "^[0-9]{6,19}$";

    public static final String NCI_ACCOUNT_REGEXP = "^[0-9]{20}";

    public static final Pattern humoPanPattern = Pattern.compile(HUMO_PAN_REGEXP);
    public static final Pattern humoTokenPattern = Pattern.compile(HUMO_TOKEN_REGEX);

    public static final Pattern masterCardPanPattern = Pattern.compile(MASTER_CARD_PAN_REGEXP);
    public static final Pattern masterCardTokenPattern = Pattern.compile(MASTER_CARD_TOKEN_REGEX);

    public static final Pattern realMastercardPanPattern = Pattern.compile(REAL_MASTERCARD_PAN_REGEXP);
    public static final Pattern realMastercardTokenPattern = Pattern.compile(REAL_MASTERCARD_TOKEN_REGEXP);

    public static final Pattern uzcardPanPattern = Pattern.compile(UZCARD_PAN_REGEXP);
    public static final Pattern uzcardCobedjPanPattern = Pattern.compile(UZCARD_COBEDJ_PAN_REGEXP);
    public static final Pattern uzcardForeignPattern = Pattern.compile(UZCARD_FOREIGN_REGEXP);
    public static final Pattern uzcardTokenPattern = Pattern.compile(UZCARD_TOKEN_REGEXP);
    public static final Pattern tkbTokenPattern = Pattern.compile(TKB_TOKEN_REGEXP);
    public static final Pattern nciAccountPattern = Pattern.compile(NCI_ACCOUNT_REGEXP);

    public static Boolean isValidUzPhone(String phoneNumber) {
        return Pattern.compile(PHONE_NUMBER_REGEX).matcher(phoneNumber).matches();
    }

    public static Boolean isValidEmail(String email) {
        return Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE).matcher(email).matches();
    }

    public static boolean isForeignUzcardBin(String binOrPan) {
        return uzcardForeignPattern.matcher(binOrPan).matches();
    }

    public static boolean isValidHumoPan(String pan) {
        return pan != null && humoPanPattern.matcher(pan).matches();
    }

    public static boolean isValidHumoToken(String token) {
        return token != null && humoTokenPattern.matcher(token).matches();
    }

    public static boolean isValidUzcardPan(String pan) {
        return pan != null && (uzcardPanPattern.matcher(pan).matches() || uzcardCobedjPanPattern.matcher(pan).matches());
    }

    public static boolean isValidUzcardToken(String token) {
        return token != null && uzcardTokenPattern.matcher(token).matches();
    }

    public static boolean isValidTkbToken(String token) {
        return token != null && tkbTokenPattern.matcher(token).matches();
    }

    public static boolean isValidRealMastercardPan(String pan) {
        return pan != null && realMastercardPanPattern.matcher(pan).matches();
    }
    public static boolean isValidRealMastercardToken(String token) {
        return token != null && realMastercardTokenPattern.matcher(token).matches();
    }

    public static boolean isValidUzcardId(String id) {
        return isValidUzcardToken(id) || isValidUzcardPan(id);
    }

    public static boolean isValidNciAccount(String account) {
        return account != null && nciAccountPattern.matcher(account).matches();
    }

    public static boolean isValidUzCard(String token) {
        return Validator.isValidUzcardToken(token) || Validator.isValidUzcardPan(token);
    }
}
