package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Limit 3000

        String result = Main.toRoman(559);

        System.out.println("result : " + result);

    }

    public static String toRoman(int number) {

        StringBuffer sb = new StringBuffer();

        String[] thousands = {"", "M", "MM", "MMM"};

        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int position = 1;
//        while (number > 0) {
//            int temp = number % 10;
//            if (position == 1) {
//                sb.insert(0, units[temp]);
//            } else if (position == 2) {
//                sb.insert(0, tens[temp]);
//            } else if (position == 3) {
//                sb.insert(0, hundreds[temp]);
//            } else {
//                sb.insert(0, thousands[temp]);
//            }
//            number = number / 10;
//            position++;
//        }

//        return sb.toString();

        // OR
        return thousands[number / 1000] + hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + units[number % 10];
    }
}
