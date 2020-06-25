import java.util.ArrayList;
import java.util.Scanner;

public class Rotate {
    private static ArrayList<Integer> Rotate(ArrayList<Integer> A, int B){
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if((i+B) < A.size()){
                ret.add(A.get(i + B));
            }
            else{
                ret.add(A.get(i+B -A.size()));
            }
        }
        return ret;
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i< n1; i++){
            a.add(scanner.nextInt());
        }
        int b = scanner.nextInt();
        a = Rotate(a,b);
        for(int i=0; i< n1; i++){
            System.out.print(a.get(i)+ " ");
        }
    }
}
