package SecondSets;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class KFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            BigDecimal bd = new BigDecimal("1");
            ArrayList<BigDecimal> fib = new ArrayList<>();
            for(int i =0; i<k;i++)
            {
                fib.add(new BigDecimal("1"));
            }
            fib.add(new BigDecimal(String.valueOf(k)));

            for(int i=k+1;i<n;i++){
                BigDecimal b = fib.get(i-1).multiply(BigDecimal.valueOf(2)).subtract(fib.get(i-k-1));
                fib.add(b);
            }
            System.out.println(fib.get(n-1).remainder(BigDecimal.valueOf(Math.pow(10,9) +7)));
        }
    }
}
