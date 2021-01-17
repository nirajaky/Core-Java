package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int arr[] = new int[total];
        int ind=0;

        for(int i=1; i<=total; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[ind] = matrix(x, y); ind++;
        }
        for(int i=0; i<total; i++){
            System.out.println(arr[i]);
        }
        //System.out.println("Result : " + num);
    }
    public static int matrix(int x, int y){
        ArrayList<Integer> base = new ArrayList<Integer>();
        base.add(0);
        base.add(1);
        int ind = 2;
        for(int i =2; i<=10000; i++){
            base.add(base.get(i-1) + ind);
            ind = ind +2;
        }
        int  num = 0;
        if(x<y){
            int b = base.get(y);
            int t = y-x;
            if(y%2 == 0){
                num = b-t;
            } else {
                num = b+t;
            }
        }
        if(x>y){
            int b = base.get(x);
            int t = x-y;
            if(x%2 == 0){
                num = b+t;
            } else {
                num = b-t;
            }
        }
        if(x==y){
            num = base.get(x);
        }
        return num;
    }
}
