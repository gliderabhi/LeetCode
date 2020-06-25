package Strings;

import java.util.Scanner;

public class LengthOfLastWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.print(lengthOfString(str));
    }

    private static int lengthOfString(String str) {
        int i=0;
        int count =0;
        for(i=str.length()-1; i>=0;i--){
            while(i>=0 && !isLetterOrDigit(str.charAt(i))){
                i--;
            }
                while(i>=0 && isLetterOrDigit(str.charAt(i))){
                    i--;
                    count++;
                }
                return count;

        }

        return count;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
