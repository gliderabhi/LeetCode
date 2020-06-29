package SecondSets;

import java.util.Scanner;

public class TwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long n = sc.nextLong();

                if(n%2 == 0)
                    System.out.println( Math.max(a,b) / Math.min(a,b)  );
                else{
                    System.out.println( Math.max(a*2,b) / Math.min(a*2,b)  );
                }

            }
        }
    }
}
