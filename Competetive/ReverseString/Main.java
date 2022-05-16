package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "Niraj Kumar";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.replace(0, 5, "Sonu"));
        System.out.println(sb.reverse());

        System.out.println(sb.append(5));
        System.out.println(sb.append(" Hello"));
        System.out.println(sb);

        System.out.println(str);

        for (int i = str.length() - 1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }


    }
}
