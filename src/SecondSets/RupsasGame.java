package SecondSets;

import java.util.Scanner;

public class RupsasGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++){
                int n = sc.nextInt();
                long[] arr = new long[n+1];
                for(int i=0;i<n;i++)
                    arr[i] = sc.nextLong();
                long m = (long) (Math.pow(10,9) +7);
                long score = 0;
                long pw =1;
                long sum = arr[0];
                if(n ==0)
                    score = 2*sum;
                for(int i=1;i<n+1;i++){
                    score = (score + arr[i]*sum )*2 %m;
                    sum = (sum + arr[i] *sum ) %m;
                    pw = (2*pw )%m;

                }
                System.out.println(score);
            }
        }
    }
}
