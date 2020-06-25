import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JPMC_prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int te=0; te<test;te++){
            int n= sc.nextInt();
            ArrayList<Integer> r = new ArrayList<>();
            for(int i=0;i<n;i++){
                r.add(Integer.parseInt(sc.next()));
            }
            int gs = sc.nextInt();
            System.out.println(getCount(r,gs));
        }
    }

    private static int getCount(ArrayList<Integer> r, int gs) {
      //  HashMap<Integer>
      return 0;
    }
}
