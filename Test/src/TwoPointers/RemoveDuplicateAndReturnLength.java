package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateAndReturnLength {
    private static long getLength(ArrayList<Integer> A){
        int count=0;
         for(int i=0; i<A.size(); i++){
             int k=1;
             while((k+i) < A.size() && A.get(i).equals(A.get(i+k))){
                 k++;
             }
             i=i+k;
             count++;
             System.out.println(count+ " "+ i+ " ");
         }

         return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        scanner.close();
        System.out.print(getLength(nums));
    }
}
