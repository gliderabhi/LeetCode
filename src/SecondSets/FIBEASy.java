package SecondSets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class FIBEASy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] array = new int[60];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < 60; i++) {
            array[i] = (array[i - 2] + array[i - 1]) % 10;
        }

        for (int i = 0; i < testCase; i++) {
            long n = scanner.nextLong();
            long a = 1;
            while (a <= n) {
                a *= 2;
            }
            System.out.println(array[(int) ((a / 2 - 1) % 60)]);
        }
    }
}
