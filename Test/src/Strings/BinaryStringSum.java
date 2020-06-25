package Strings;

import java.util.Scanner;

public class BinaryStringSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b = scanner.nextLine();
        System.out.print(sunBinary(a,b));
    }

     private static String sumBinary(String A,String B){
         int n = A.length();
         int m = B.length();
         if(n > m){
             while(A.length() != B.length()){
                 B = "0"+ B;
             }
         }
         if(m > n){
             while(A.length() != B.length()){
                 A = "0"+ A;
             }
         }
// cout<<A<<" “;
// cout<<B<<” ";
         int carry = 0;
         int a = A.length() - 1;
         int b = B.length() - 1;
         String ans="";
         while(a >= 0) {
             if (Integer.parseInt(String.valueOf(A.charAt(a))) == 1 && Integer.parseInt(String.valueOf(B.charAt(b))) == 1 && carry == 1) {
                 ans = "1" + ans;
             } else if (Integer.parseInt(String.valueOf(A.charAt(a))) == 1 && Integer.parseInt(String.valueOf(B.charAt(b))) == 1 && carry == 0) {
                 ans = "0" + ans;
                 carry = 1;
             } else if ((Integer.parseInt(String.valueOf(A.charAt(a))) == 1 || Integer.parseInt(String.valueOf(B.charAt(b))) == 1) && carry == 1) {
                 ans = "0" + ans;
             } else if ((Integer.parseInt(String.valueOf(A.charAt(a))) == 1 || Integer.parseInt(String.valueOf(B.charAt(b))) == 1) && carry == 0) {
                 ans = "1" + ans;
             } else if ((Integer.parseInt(String.valueOf(A.charAt(a))) == 0 && Integer.parseInt(String.valueOf(B.charAt(b))) == 1) && carry == 1) {
                 ans = "1" + ans;
                 carry = 0;
             } else if ((Integer.parseInt(String.valueOf(A.charAt(a))) == 1 && Integer.parseInt(String.valueOf(B.charAt(b))) == 1) && carry == 0) {
                 ans = "0" + ans;
             }

             a--;
             b--;

         }
         if(carry == 1)
             ans = "1" + ans;
         return ans;
     }

    private static String sunBinary(String a, String b) {
        int i=a.length()-1;
        int j= b.length()-1;
        int carry=0;
        String temp = "";
            while(i>=0 && j>=0) {
                if (Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(j))) == 0) {
                    temp += "0";
                } else if (Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(j))) == 1) {
                    if (carry == 0) {
                        temp += '1';
                        carry = 0;
                    } else {
                        temp += '1';
                        carry = 1;
                    }
                } else {
                    if (carry == 0) {
                        temp += '0';
                        carry = 1;
                    } else {
                        temp += '1';
                        carry = 1;
                    }
                }

                i--;
                j--;
            }

            while(i>=0){
                if(Integer.parseInt(String.valueOf(a.charAt(i)))+ carry == 1 ){
                    temp+='1';
                }else if(Integer.parseInt(String.valueOf(a.charAt(i)))+ carry == 0){
                    temp+=0;
                }else{
                    if (carry == 0) {
                        temp += '0';
                        carry = 1;
                    } else {
                        temp += '1';
                        carry = 1;
                    }
                }
                i--;
            }
        while(j>=0){
            if(Integer.parseInt(String.valueOf(a.charAt(j)))+ carry == 1 ){
                temp+='1';
            }else if(Integer.parseInt(String.valueOf(a.charAt(j)))+ carry == 0){
                temp+=0;
            }else{
                if (carry == 0) {
                    temp += '0';
                    carry = 1;
                } else {
                    temp += '1';
                    carry = 1;
                }
            }
            j--;
        }
        if(carry!=0)
           temp += String.valueOf(carry);

            String finall ="";
           // System.out.print(temp);
        for( i=temp.length()-1; i>=0;i--){
            finall+=temp.charAt(i);
        }
        return finall;
    }
}
