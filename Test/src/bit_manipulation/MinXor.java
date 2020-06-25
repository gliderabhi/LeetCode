package bit_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinXor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        ArrayList<Long> r = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            r.add(scanner.nextLong());

        }

        scanner.close();
        System.out.print(minXor(r));
    }

    private static long minXor(ArrayList<Long> A) {
        long min = Integer.MAX_VALUE;
        Collections.sort(A);
        for(long i=0;i<A.size()-1;i++) {

                    long xor = A.get((int) i) ^ A.get((int) i+1);
                  //  System.out.println(xor + " " + A.get((int) i) + " " + A.get((int) j));
                    if (xor < min) {
                        min = xor;
                    }

        }
        return min;
    }
}
