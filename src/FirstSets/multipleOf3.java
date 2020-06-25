package FirstSets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class multipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        while(sc.hasNext()){
            int test = sc.nextInt();
            for(int p=0;p<test;p++){
                long k = sc.nextLong();
                int d0 = sc.nextInt();
                int d1 = sc.nextInt();

                double  bd = k;
                double sumEven = 0;
                double sumOdd = 0;
                sumEven = d0+  (Math.pow(4, bd/2 -1) -1)*2/3*(d0+d1);
                if(bd%2 ==0){
                    sumOdd = d1 + 10;
                }
            }
        }
    }
}
