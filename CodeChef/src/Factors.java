import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0) {
                if(!x.contains(i)) {
                    x.add(i);
                    x.add(n / i);
                }
            }
        }
        Collections.sort(x);
        for(int i=0;i<x.size();i++)
            System.out.println(x.get(i));

        long endTime   = System.nanoTime();
        double totalTime = (endTime - startTime)/Math.pow(10,9);
        System.out.println(totalTime);
    }
}
