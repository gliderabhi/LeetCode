package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(scanner.nextInt());
        }
        int r = scanner.nextInt();
        scanner.close();
        if (YesNO(A,r) == 1) {
            System.out.print("Yes");

        } else {
            System.out.print("No");
        }
    }

    private static int YesNO(ArrayList<Integer> A, int B) {
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.size();j++){
                    System.out.println(i+ " "+ j);
                    if(A.get(j)> A.get(i)+B){
                        break;
                    }else{
                        if(A.get(j) == A.get(i)+B && i!=j){
                            return 1;
                        }
                    }

            }
        }
        return 0;
    }
}
