

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(detectCapital("AdfSgg"));
    }

    public static boolean detectCapital(String str) {
        int len = str.length();
        boolean check1 = false; // ALL CAPITAL
        boolean check2 = false;
        boolean check3 = false;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                check1 = true;
            } else {
                check1 = false;
                break;
            }
        }

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                check2 = true;
            } else {
                check2 = false;
                break;
            }
        }
        for (int i = 0; i < len-1; i++) {
            if ((str.charAt(0) >= 65 && str.charAt(0) <= 90)  && str.charAt(i+1) >= 97 && str.charAt(i+1) <= 122) {
                check3 = true;
            } else {
                check3 = false;
                break;
            }
        }

        return check1 || check2 || check3;
    }
}
