package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution sl = new Solution();
        String result = sl.longestPalindrome("MaasaaJkal");
        System.out.println(result);
    }
}

class Solution {
    int resultStart;
    int resultLength;

    public String longestPalindrome(String str) {
        int strLength = str.length();
        if (strLength < 2) {
            return str;
        }

        for (int start = 0; start < str.length(); start++) {
            checkPalindrome(str, start, start);
            checkPalindrome(str, start, start + 1);
        }
        return str.substring(resultStart, resultStart + resultLength);
    }

    private void checkPalindrome(String str, int begin, int end) {

        while (begin >= 0 && end < str.length() && (str.charAt(begin) == str.charAt(end))) {
            begin--;
            end++;
        }
        if (resultLength < (end - begin - 1)) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
