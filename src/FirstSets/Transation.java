package FirstSets;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Transation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] costs = sc.nextLine().split(" ");
            double a = Double.parseDouble(costs[0]);
            if (a+0.5 < Double.parseDouble(costs[1])) {
                if (a % 5 == 0) {
                    double balance = Double.parseDouble(costs[1]);
                    double val = balance - a - 0.50;
                    DecimalFormat dec = new DecimalFormat("#0.00");
                    System.out.println(dec.format(val));
                } else {
                    System.out.printf(costs[1]);
                }

            } else {
                System.out.println(costs[1]);
            }
        }
    }
}
