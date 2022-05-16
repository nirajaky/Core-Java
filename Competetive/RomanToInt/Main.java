package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = romanToInt("DLIX");
        System.out.println("number: " + number);
    }

    public static int romanToInt(String str) {

        HashMap<Character, Integer> mapValue = new HashMap<>();
        mapValue.put('M', 1000);
        mapValue.put('D', 500);
        mapValue.put('C', 100);
        mapValue.put('L', 50);
        mapValue.put('X', 10);
        mapValue.put('V', 5);
        mapValue.put('I', 1);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && (mapValue.get(str.charAt(i))) > mapValue.get(str.charAt(i - 1))) {
                result = result + mapValue.get(str.charAt(i)) - (2 * mapValue.get(str.charAt(i - 1)));
            } else {
                result = result + mapValue.get(str.charAt(i));
            }
        }
        return result;
    }
}
