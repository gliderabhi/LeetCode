package SecondSets;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int j=0;j<t;j++){
                long n = sc.nextLong();
                long k = sc.nextLong();
                long e = sc.nextLong();
                long m = sc.nextLong();
                int[] arr = new int[(int)n];
                for(int i=0;i<n;i++) {
                    if (i < n-1) {
                        for (int p = 0; p < e; p++)
                            arr[i] += sc.nextInt();
                    }else
                        for(int p=0;p<e-1;p++)
                            arr[i] += sc.nextInt();
                }
                Arrays.sort(arr,0,(int)n-1);
               /* for(int a : arr)
                    System.out.println(a);*/
                long req = arr[(int)(n-k-1)] - arr[(int)(n-1)] +1;
                if(req<=m)
                    if(req>0)
                      System.out.println( req);
                    else
                        System.out.println(0);
                else
                    System.out.println("Impossible");
            }
        }
    }
}
