package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class sinlgeNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] d= new int[n];
        for(int i=0;i<n;i++){
            d[i]= scanner.nextInt();
        }
        System.out.print(getNum(d));
    }

    private static int  getNum(int[] d) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(d[0]);
        for(int i=1;i<d.length;i++){
            if(list.contains(d[i])){
                list.remove((Integer) d[i]);
            }else{
                list.add(d[i]);
            }
        }
        return list.get(0);
        //accepted solution more time taking
      /*  for(int i=0;i<d.length;i++){
            int k = d[i];
            int count =0;
            for(int j=0;j<d.length;j++){
                if(k==d[j]){
                    count++;
                    if(count>1){
                        break;
                    }
                }
            }
            if(count==1){
                return d[i];
            }
        }
        return 0;*/
    }
}
