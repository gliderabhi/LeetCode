package SecondSets;

import java.math.BigDecimal;
import java.util.Scanner;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal t = sc.nextBigDecimal();
        String v = String.valueOf(t);
        BigDecimal bd = new BigDecimal(1);
        while(t.compareTo(bd) !=0 ) {
             bd = new BigDecimal(1);
            for (char c : v.toCharArray()) {
                BigDecimal pows = BigDecimal.valueOf(Math.pow(Integer.parseInt(String.valueOf(c)),2));
                bd.add(pows);
            }
            t = bd;

        }
        System.out.println("Done");


    }
}

