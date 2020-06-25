package SecondSets;

import java.util.Scanner;

public class ChefAndSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++) {
                long n = sc.nextLong();
                long temp = n;
               //x = (sqrt + 1) * (sqrt + 1) - n;
                boolean work = true;
                boolean notFound = false;
                       int x=0;
                while(work) {
                    x += 1;
                    long v = n + (x*x);
                    if(x*x<0)
                        notFound = true;
                    if (chechRoot(v))
                        work = false;
                }
                if(!notFound)
                System.out.println(x);
                else
                    System.out.println(-1);
            }
        }
    }
    private static boolean chechRoot(long x){
        int v = (int) Math.sqrt(x);
        //System.out.println( x);
        return x == v * v;
    }
}
