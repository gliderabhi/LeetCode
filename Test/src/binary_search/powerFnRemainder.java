package binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class powerFnRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.print(poww(x, n, d));
    }

   private static  long  poww(int x, int n, int d)
    {
        long res = 1;
        int check=0;

        if(x==0 && n==0){
            if(d!=1){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(x==0){
            return 0;
        }

        if(x < 0){
            x = Math.abs(x);
            if(n%2 != 0){
                check = 1;
            }
        }
        long a=x;
        int b=n;
        a = a % d;
        while (b> 0){
            if((b & 1)==1){
                res = (res * a) % d;
            }
            b = b >> 1;
            a = (a * a) % d;
        }

        if(check == 1){
            return d-(int)res;
        }
        return (int)res;
    }


}
