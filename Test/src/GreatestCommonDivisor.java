import java.util.ArrayList;
import java.util.Scanner;

public class GreatestCommonDivisor {
    private static ArrayList<Integer> getFactor(int r){
        ArrayList<Integer> factor = new ArrayList<>();
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i=1 ; i<= Math.sqrt(r); i++){
            if(r%i==0) {
                factor.add(i);
                int d= r / i;
                if(!factor.contains(d) ){
                    fact.add(d);
                }
            }
        }
        for(int i=fact.size()-1; i>=0 ; i--){
            factor.add(fact.get(i));
        }
        return factor;
    }
    private static int gcd_better(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    private static int gcd(int n, int m){
        if(n==0 || m ==0){
            if(n==0){
                return m;
            }else{
                return n;
            }
        }else {
            ArrayList<Integer> factn = getFactor(n);
            factn.remove(0);
            ArrayList<Integer> factm = getFactor(m);
            factm.remove(0);
            for (int i = factm.size() - 1; i >= 0; i--) {
                if (factn.contains(factm.get(i))) {
                    return factm.get(i);
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();

        System.out.print(gcd(n,m));
    }
}
