package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {2, 5, 7, 9, 4, 2, 11};
        int req = 9;
        boolean found = false;

//        for (int i = 0; i < arr.length -1; i++) {
//            for(int j = (i+1); j < arr.length; j++) {
//                if( arr[i] + arr[j] == req) {
//                    System.out.println(i + " " + j);
//                    found = true;
//                    break;
//                }
//                if(found){
//                    break;
//                }
//            }
//        }

        // OR

        Map<Integer, Integer> visitedList = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int delta = req - arr[i];
            if (visitedList.containsKey(delta)) {
                System.out.println(i + " " + visitedList.get(delta));
            }
            visitedList.put(arr[i], i);
        }
    }
}
