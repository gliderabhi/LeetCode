package SecondSets;

import java.math.BigDecimal;
import java.util.Scanner;

public class Rem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int j=0;j<t;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.print(a%b);

                int n =1;
                BigDecimal bd = new BigDecimal("1");
                bd = bd.multiply(BigDecimal.valueOf(n));
            }
        }
    }
}
