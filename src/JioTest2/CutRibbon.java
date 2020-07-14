package JioTest2;

import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc .nextInt();
            for(int p=0;p<t;p++){
                int n = sc.nextInt();
                int l = sc.nextInt();

                System.out.println(count(2,n/2-1,l));
            }
        }
    }
    static int p = 1000000007;
    private static int count(int x , int y, int l){
        // Initialize result
        int res = 1;

        // Update x if it is more
        // than or equal to p
        x = x % p;

        while (y > 0 && y<=l)
        {
            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
}
