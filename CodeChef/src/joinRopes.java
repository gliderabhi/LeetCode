import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class joinRopes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0;i<n;i++){
            r.add(Integer.parseInt(sc.next()));
        }

        System.out.println(minCost(r));
    }

    private static int minCost(ArrayList<Integer> r) {
        int n= r.size();
        Collections.sort(r);
        int i=0;
        return i;
    }
}
