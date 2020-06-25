package Strings;

import java.util.Scanner;

public class PallindromeString {
    public static int isPallindrome(String A){
        if(A == null) return 0;
        String str = A.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString())? 1 : 0;
    }
    private static int Pallindrome(String str) {
        int i = 0;
        if (str.length() == 0 || str.length() == 1) {
            return 1;
        }
        int length = str.length();
        char[] strig = str.toLowerCase().toCharArray();
        int j = str.length() - 1;
        while (i <= j || length == 0) {
            while (!isLetterOrDigit(strig[i])) {
                i++;
                length--;
                if(i> str.length()-1){
                    return 0;
                }
                //    System.out.println(i);
            }
            while (!isLetterOrDigit(strig[j])) {
                j--;
                length--;
                if(j<0){
                    return  0;
                }
                //   System.out.println(j);
            }
            // System.out.println(strig[i] + " " + strig[j]);
            if (strig[i] == strig[j]) {

            } else {
                return 0;
            }
            i++;
            j--;
            length -= 2;

        }
        if (length == 0) {
            return 0;
        } else {


            return 1;
        }
    }
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        if(isPallindrome(str)==1){
            System.out.print("Pallindrome");
        }else{
            System.out.print("Not Pallindrome");

        }
    }
}
