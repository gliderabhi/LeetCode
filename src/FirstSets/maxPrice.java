package FirstSets;

import java.util.Arrays;
import java.util.Scanner;

public class maxPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int te = sc.nextInt();
            long[ ] ars = new long[te];
            for(int p=0;p<te;p++)
                ars[p] = sc.nextLong();
            Arrays.sort(ars);
            long maxPrice = 0;
            for(int i=0;i<te;i++)
                maxPrice = Math.max(maxPrice, ars[i] * (te-i));

            System.out.println(maxPrice);
        }
    }
}
