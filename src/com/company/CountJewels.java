package com.company;

import java.util.Scanner;

public class CountJewels {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String jwel  = scanner.nextLine();
        String stones  = scanner.nextLine();
        System.out.print(Jewels(jwel,stones));
    }

    private static int Jewels(String jwel, String stones) {
        int i=0;int j=0;
        int res=0;
        while(i<jwel.length()){
            j=0;
            while (j<stones.length()){
                if(stones.charAt(j)== jwel.charAt(i)){
                    res++;
                }
                j++;
            }
            i++;
        }

        return res;
    }

}
