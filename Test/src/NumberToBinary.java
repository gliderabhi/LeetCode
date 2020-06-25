import java.util.ArrayList;
import java.util.Scanner;

public class NumberToBinary {
    private static String getBInary(int r ) {
        ArrayList<Integer> res = new ArrayList<>();
        String finalData = "";
        if (r == 0) {
            res.add(0);
            finalData =finalData +  "0";
        } else if (r == 1) {
            res.add(1);
            finalData =  finalData+ "1";
        } else {
            while (r > 0) {
                res.add(r%2);
                r/=2;

            }
        }
        for(int i=res.size()-1; i>=0; i--){
            finalData = finalData + String.valueOf(res.get(i));
        }
       return finalData;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /*ArrayList<Integer> res = getBInary(n);
        for(int i=res.size()-1; i>=0; i--){
            System.out.print(res.get(i) + " ");
        }*/
        System.out.print(getBInary(n));
    }
}
