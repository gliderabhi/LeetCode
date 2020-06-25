import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxDistance {

    private static int maxDist(ArrayList<Integer> a){
        int i=0;
        int j=a.size()-1;
        if(a.size()>1) {
            while ((j - i) >= 1) {
                for (int t = j; t >= i; t--) {
                    if (a.get(i) <= a.get(t)) {
                        //System.out.print( a.get(i) + " " + a.get(t) + "\n");

                        return (t - i);

                    }
                }
                i++;
            }
        }else{
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        int r = 99173104;
        System.out.print(r);
        System.out.print(maxDist(a)+ " ");
    }
}
