import java.util.ArrayList;
import java.util.Scanner;

public class LargestCoprimeDivisor {
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
          //  System.out.print(fact.get(i)+ " ");
        }
        return factor;
    }
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    private static int lcd(int n, int m){
        if(n==0 || m ==0){
            if(n==0){
                return m;
            }else{
                return n;
            }
        }else {
            ArrayList<Integer> factn = getFactor(n);
            for (int size = factn.size(), i = size-1; i >= 0 ; i--) {
                if (gcd(factn.get(i), m) == 1) {
                    return factn.get(i);
                }
            }

        }


        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();

        System.out.print(lcd(n,m));
    }
}
