import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPrimesBest {

    public static ArrayList<Integer> primesum(int A) {
        boolean[] primes = new boolean[A+1];
        primes[0] = false;
        primes[1] = false;
        for (int i=2; i<=A; i++) {
            primes[i] = true;
        }

        for (int i=2; i <= Math.sqrt(A); i++) {
            for (int j=i; j*i<=A; j++) {
                primes[j*i] = false;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=2; i<=A/2; i++) {
            if (primes[i] && primes[A - i]) {
                ans.add(i);
                ans.add(A-i);
                return ans;
            }
        }

        return new ArrayList<Integer>();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> re = primesum(n);
        for(int i=0;i<re.size(); i++){
            System.out.print(re.get(i) + " ");
        }
    }
}
