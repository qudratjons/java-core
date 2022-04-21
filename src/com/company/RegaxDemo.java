package com.company;

import java.util.Scanner;

public class RegaxDemo {
    public static void main(String[] args) {

        System.out.println("Davlat mashina raqamini kiriting");
        System.out.print(" ---> ");
        Scanner s = new Scanner(System.in);

        String carNumber = s.nextLine();

        String personRegax = "\\d{2}[A-Z]\\d{3}[A-Z]{2}";

        String companyRegax = "\\d{5}[A-Z]{3}";

        if (carNumber.matches(personRegax)) {
            System.out.println("Bu raqam jismoniy shaxsga tegishli");
            System.out.println(findRegion(carNumber));
        } else if (carNumber.matches(companyRegax)) {
            System.out.println("Bu raqam kompaniyaga tegishli");
            System.out.println(findRegion(carNumber));
        } else {
            System.out.println("Mashina raqami noto'g'ri kiritilgan");
        }
    }

    public static String findRegion(final String carNumber) {
        switch (carNumber.substring(0, 2)) {
            case "01":
                return "Toshkent shahri";
            case "10":
                return "Toshkent viloyati";
            case "20":
                return "Sirdaryo viloyati";
            case "25":
                return "Jizzax viloyati";
            case "30":
                return "Samarqand viloyati";
            case "40":
                return "Fargʻona viloyati";
            case "50":
                return "Namangan viloyati";
            case "60":
                return "Andijon viloyati";
            case "70":
                return "Qashqadaryo viloyati";
            case "75":
                return "Surxondaryo viloyati";
            case "80":
                return "Buxoro viloyati";
            case "85":
                return "Navoiy viloyati";
            case "90":
                return "Xorazm viloyati";
            case "95":
                return "Qoraqalpogʻiston Respublikasi";
            default:
                return "Bunday raqamdagi region topilmadi";
        }
    }
}
