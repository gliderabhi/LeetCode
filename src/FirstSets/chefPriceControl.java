package FirstSets;

import java.util.Scanner;

public class chefPriceControl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0;i<test; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long sum =0;
            long actSum = 0;
            //int[] arr = new int[n];
            for(int j=0;j<n;j++){
              int vals = sc.nextInt();
              if(vals>k)
                  sum+= k;
              else
                  sum+=vals;

              actSum += vals;
            }
            System.out.println(actSum - sum);
        }
    }
}
