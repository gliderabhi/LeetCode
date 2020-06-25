package FirstSets;

import java.util.Scanner;

public class HandkerCheif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            for (int k = 0; k < t; k++) {
                int l = sc.nextInt();
                int b = sc.nextInt();
                int div = Math.max(l,b);
                int divisor = Math.min(l,b);
                int rem = 120;
                while(rem!=0){
                    rem = div%divisor;
                    div = divisor;
                    divisor = rem;
                }
                System.out.print(div);
            }
        }
    }
}
