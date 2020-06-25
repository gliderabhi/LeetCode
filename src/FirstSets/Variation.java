package FirstSets;

import java.util.Arrays;
import java.util.Scanner;

public class Variation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long N = sc.nextLong();
            long k = sc.nextLong();
            long[] nums = new long[(int)N];
            for(long i=0;i<N;i++)
                nums[(int)i] = sc.nextLong();

            Arrays.sort(nums);
            long count =0;
            for(long i=0;i<N;i++){
                for(long j=i+1;j<N;j++){
                    if(nums[(int)j]- nums[(int)i] >= k) {
                        count += N-j;
                        break;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
