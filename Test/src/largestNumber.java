import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class largestNumber {

    private static int getFirstDigit(int r){
        int t=1;
       if(r>10) {
           while (t < r) {
               t *= 10;
           }

           t /= 10;
           return (r / t);
       }else{
           return r;
       }
    }

    private static String largestNumber(final List<Integer> A) {
        String num = "";
        int onlyZero = 0;
        int otherThereQ = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < A.size(); i++) {
            switch (getFirstDigit(A.get(i))) {
                case 0:
                    list.get(0).add(A.get(i));
                    break;
                case 1:
                    list.get(1).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 2:
                    list.get(2).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 3:
                    list.get(3).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 4:
                    list.get(4).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 5:
                    list.get(5).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 6:
                    list.get(6).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 7:
                    list.get(7).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 8:
                    list.get(8).add(A.get(i));
                    otherThereQ = 1;
                    break;
                case 9:
                    list.get(9).add(A.get(i));
                    otherThereQ = 1;
                    break;
            }
        }
        if (otherThereQ != 1) {
            return "0";
        } else {
            for (int i = 0; i <= 9; i++) {
                Collections.sort(list.get(i));
            }

            for (int i = 9; i >= 0; i--) {
                int k = list.get(i).size() - 1;
                while (k >= 0) {
                    //System.out.print(String.valueOf(list.get(i).get(k)) + " ");
                    num += String.valueOf(list.get(i).get(k));
                    k--;
                }
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ;i< n; i++){
            arr.add(scanner.nextInt());
        }

        System.out.print(largestNumber(arr));
    }
}
