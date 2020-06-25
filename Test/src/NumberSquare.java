import java.util.ArrayList;
import java.util.Scanner;

public class NumberSquare {
    public static ArrayList<ArrayList<Integer>> squareSum(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int a = 0; a * a < A; a++) {
            for (int b = 0; b * b < A; b++) {
                if (a * a + b * b == A) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    if(a!=0) {
                        newEntry.add(a);
                    }
                    newEntry.add(b);
                    ans.add(newEntry);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r= scanner.nextInt();
        ArrayList<ArrayList<Integer>> res = squareSum(r);
        for(int i=0; i< res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }
    }
}
