package Strings;

import java.util.Scanner;

public class MaxPAllindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.print(getPlalindromeString(s));
    }

    private static String getPlalindromeString(String s) {
        s= s.toLowerCase();
        String pallindrome="";
        String temp ="";
        int count =0, max= Integer.MIN_VALUE;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i-1)==s.charAt(i+1)){
                temp= "";count=0;
                int j=0;
                while((i-j)>=0 && (i+j)< s.length() && s.charAt(i-j)==s.charAt(i+j)){
                  count++;
                  temp=s.charAt(i-j)+ temp + s.charAt(i+j);
                  System.out.print(i);
                    j++;
                }

                if(count>max){
                    pallindrome= temp;
                }
            }
            i++;
        }
        return pallindrome;
    }
}
