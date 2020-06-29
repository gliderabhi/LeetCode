package SecondSets;

import java.math.BigDecimal;
import java.util.Scanner;

//not complete, wrong
public class Coca2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    BigDecimal bd = sc.nextBigDecimal();
                    bd  = bd.divide(BigDecimal.valueOf(100000000));
                    arr[i] = Integer.parseInt(String.valueOf(bd.divide(bd)));
                }
               /* int start = 0;
                int end = 0;
                int count =0;
                int sum = arr[0];

                while(start< n && end<n){
                    if(sum>10){
                        end ++;

                        if(end >= start)
                            count+= end- start;

                        if(end < n)
                            sum+= arr[end];
                    }
                    else{
                        sum-= arr[start];
                        start++;
                    }
                }

                System.out.println(count);*/
                System.out.println(countSubarray(arr,n,10));

            }
        }
    }

    static int countSubarray(int arr[],
                             int n, int k)
    {
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (sum + arr[j] > k) {
                    sum += arr[j];
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
