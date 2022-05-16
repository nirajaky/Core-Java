package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        System.out.println(" Input : ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num > 0) {
            int temp = num % 10;
            reversed = reversed*10 + temp;
            num = num / 10;
        }

        System.out.println(" reversed : " + reversed);
    }
}
