package binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Sqrt {
    private static long sqrt(long r){
         return (long) Math.pow(r,0.5);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long r = scanner.nextLong();
        System.out.print(sqrt(r));
    }
}
