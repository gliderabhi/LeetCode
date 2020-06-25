package Strings;

import java.util.Scanner;

public class FindSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b= scanner.nextLine();
        System.out.print(getPos(a,b));
    }

    private static int getPos(String a, String b) {
        /* int res=0;
         int i = 0,j=0;
         while(i< a.length()){
             j=0;
             if(b.charAt(j)==a.charAt(i)){
                 int count =0;
                 while(j<b.length() && b.charAt(j)==a.charAt(i)){
                     j++;i++;count++;
                 }
                 if(count==b.length()){
                     return i-b.length();
                 }
                 i++;

             }
         }*/



          return a.indexOf(b);

    }

}
