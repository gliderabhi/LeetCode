import java.util.ArrayList;
import java.util.Scanner;

public class VerifyPrime {
    private static int getPrime(int r) {
        if(r==1){
            return 0;
        }else {
            ArrayList<Integer> factor = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(r); i++) {
                if (r % i == 0) {
                    factor.add(i);
                    int d = r / i;
                    if (!factor.contains(d)) {
                        factor.add(d);
                    }
                    if (factor.size() >= 3) {
                        return 0;
                    }
                }
            }
            return 1;
        }
    }
    public static int isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if(isPrime(r)==1){
            System.out.print("Prime " + "\n");
        }
        else{
            System.out.print("Not prime ");
        }
    }
}
