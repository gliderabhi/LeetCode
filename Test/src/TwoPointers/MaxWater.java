package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxWater {
    private static long getMax(ArrayList<Integer> A){
        long max = Integer.MIN_VALUE;
        //Collections.sort(A);
        int i=0;int j=A.size()-1;
        while(i<j) {
            long arr= Math.min(A.get(i),A.get(j))*(j-i);
            if(arr > max) {
                max = arr;
            }
                if(A.get(i)<A.get(j))
                    i++;
                else
                    j--;

            }

        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0;i<n;i++){
            r.add(scanner.nextInt());
        }
        System.out.print(getMax(r));
    }
}
