import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class minSteps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> A= new ArrayList<>();
        ArrayList<Integer> B= new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(scanner.nextInt());
        }
        for(int i=0;i<n;i++){
            B.add(scanner.nextInt());
        }
        scanner.close();
        System.out.print(getData(A,B));
    }

    private static int getData(ArrayList<Integer> a, ArrayList<Integer> b) {
        int steps=0;
        for(int i=0;i<a.size()-1;i++){
            steps+= max(abs(a.get(i)-a.get(i+1)),abs(b.get(i)-b.get(i+1)));
        }
        return steps;
    }
}
