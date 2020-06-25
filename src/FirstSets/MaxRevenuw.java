package FirstSets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaxRevenuw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long n = Long.parseLong(sc.nextLine());
            ArrayList<Integer> list = new ArrayList<>();
            for(int k=0;k<n;k++)
                list.add(sc.nextInt());

            Collections.sort(list);
            long maxSum = Integer.MIN_VALUE;
            for(long i =0;i<n;i++){
                long sum = list.get((int) i) * (list.size()-i);
                if(sum > maxSum)
                    maxSum = sum;

                System.out.println(maxSum);
            }
            System.out.println(maxSum);
        }

    }
}
