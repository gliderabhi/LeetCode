import java.util.Scanner;

public class interestingPrimes {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(getNum(n));

        long end = System.nanoTime();
        System.out.println((end-start)/1000000000);
    }

    private static int getNum(long n) {
        int a =1;
        int b=1;
        long v =0;
        int count= 0;
        while(v<=n){
            v= (long) Math.pow(a,2) + (long ) Math.pow(b,4);
            System.out.println(a+ " "+ b);
            a++;b++;

            count++;

        }

        return count;
    }
}
