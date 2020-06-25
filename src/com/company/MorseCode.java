package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {
        Scanner scane= new Scanner(System.in);
        //ArrayList<String> v= new ArrayList<>();
        int n= scane.nextInt();
        String[] v = new String[n];
        for(int i=0;i<n;i++){
           // v.add(scane.nextLine());
            v[i]= scane.nextLine();
        }
        System.out.print(getMorse(v));
    }

    private static int getMorse(String[] v) {
        String[] list = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<String> trans= new ArrayList<>();

        int i=0; String tran="";
        while(i<v.length){
            int k=0;
           tran="";
            while(k<v[i].length()){
                tran+= list[(int)v[i].charAt(k) -97];
                k++;
            }
            if(!trans.contains(tran)) {
                trans.add(tran);
            }
            i++;
        }

        return trans.size();
     }
}
