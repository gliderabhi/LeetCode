package bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchNunUsingBits {
    private static long getNum(ArrayList<Long> A) {
        long d = 0;
        //Collections.sort(A);
        int count = 0;
        long i;
        for (i = 0; i < A.size() ; i++) {
           d = d ^ A.get((int) i);
        }
        return d;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        ArrayList<Long> r = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            r.add(scanner.nextLong());

        }

        scanner.close();
        System.out.print(getNum(r));
    }
}
