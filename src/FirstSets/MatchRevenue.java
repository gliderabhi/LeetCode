package FirstSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MatchRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] =sc.nextInt();
            long sum =0;
            Arrays.sort(arr);

            for (int i = n - 1; i >= 0; i--)
                sum += i * arr[i] - (n - 1 - i)
                        * arr[i];
            System.out.println(sum );
        }
    }
}
