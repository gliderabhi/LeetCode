package FirstSets;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int count =0;
            for (int i = 0; i < n; i++) {
                BigDecimal bd = new BigDecimal(sc.nextLine());
                BigDecimal rem = bd.remainder(BigDecimal.valueOf(k));
                if(rem.intValue() ==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
