package com.company;

import java.util.Scanner;

public class DefangingIp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String val  = scanner.nextLine();
        System.out.print(DefangIp(val));
    }

    private static String DefangIp(String val) {
        String res = "";
        int i=0;
        while(i< val.length()){
            if(val.charAt(i)=='.'){
                res+="[";
                res+=".";
                res+="]";

            }else{
                res+=val.charAt(i);

            }
            i++;
        }
        return res;
    }
}
