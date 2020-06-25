import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        ArrayList<Integer> result = getFactor(r);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
