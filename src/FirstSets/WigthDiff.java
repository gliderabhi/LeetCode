package FirstSets;

import java.util.Arrays;
import java.util.Scanner;

public class WigthDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int test = sc.nextInt();
            for(int p=0;p<test;p++){
                int n = sc.nextInt();
                int k =sc.nextInt();
                int k2 = n-k;
                long sum =0;
                int[] arr = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                    sum+=arr[i];
                }
                Arrays.sort(arr);
                k = Math.min(k,k2);
                long sonSum =0;
                for(int i=0;i<k;i++)
                    sonSum+= arr[i];

                System.out.println(sum - 2* sonSum);
            }
        }
    }
}
