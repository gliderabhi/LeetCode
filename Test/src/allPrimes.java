import java.util.ArrayList;
import java.util.Scanner;

public class allPrimes {
    private static ArrayList<Integer> sieve (int A){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        for(int i=2; i<=A; i++){
            result.add(1);
        }
        for(int i=4; i<=A ;i+=2){
            result.set(i,0);
        }

       for(int i=3 ; i<= A ; i++){
            if(result.get(i)==1){
                for(int j=i; j<=A ;j+=i){
                    if(j!=i) {
                        result.set(j, 0);
                    }
                }
            }
        }
        ArrayList<Integer> finl = new ArrayList<>();
        for(int i=0;i<result.size(); i++){
            if(result.get(i)==1){
                finl.add(i);
            }
        }
        return finl;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> re = sieve(n);
        for(int i=0;i<re.size(); i++){
            System.out.print(re.get(i) + " ");
        }
    }
}
