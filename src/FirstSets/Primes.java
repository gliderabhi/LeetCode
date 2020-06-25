package FirstSets;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p=0;p<t;p++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i,j,flag;
            if (a == 1) {
                System.out.println(a);
                a++;
                if (b >= 2) {
                    System.out.println(a);
                    a++;
                }
            }
            if (a == 2)
                System.out.println(a);

            // MAKING SURE THAT a IS ODD BEFORE WE BEGIN
            // THE LOOP
            if (a % 2 == 0)
                a++;

            // NOTE : WE TRAVERSE THROUGH ODD NUMBERS ONLY
            for (i = a; i <= b; i = i + 2) {

                // flag variable to tell
                // if i is prime or not
                flag = 1;

                // WE TRAVERSE TILL SQUARE ROOT OF j only.
                // (LARGEST POSSIBLE VALUE OF A PRIME FACTOR)
                for (j = 2; j * j <= i; ++j) {
                    if (i % j == 0) {
                        flag = 0;
                        break;
                    }
                }

                // flag = 1 means i is prime
                // and flag = 0 means i is not prime
                if (flag == 1)
                    System.out.println(i);
            }

        }
    }
}
