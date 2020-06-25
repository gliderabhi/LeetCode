package Strings;

import java.util.Scanner;

public class CountAndSay {
    private static String getString(int n){
        String result = "1";
        String demo = "";
        if(n==1){
            return result;
        }else{
            int value =0;int count =0;
            int i =1;
            while(i<n){
                value=Integer.parseInt(String.valueOf(result.charAt(0)));
                // System.out.println(value);
                int k=0;
                count=0;
                demo="";
                while(k< result.length()) {
                    while (k<result.length() && Integer.parseInt(String.valueOf(result.charAt(k))) == value) {

                        k++;count++;
                        //System.out.println(count);
                    }

                    demo+=String.valueOf(count)+String.valueOf(value);
                    if(k!=result.length()) {
                        value = Integer.parseInt(String.valueOf(result.charAt(k)));

                    }
                    count = 0;
                }
                result= demo;
               // System.out.println(result);
                i++;
            }
            return result;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.print(getString(n));
    }
}
