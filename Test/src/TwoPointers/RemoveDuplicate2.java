package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate2 {

    private static long getLength(ArrayList<Integer> A){
        int i=0;
        int j=0;
        int n=A.size();
        if(n==1){
            return 1;
        }
        for(i=0;i<n;)
        {
            if(i< n-2 && A.get(i)==A.get(i+1)&&A.get(i)==A.get(i+2))
            {
                A.set(j++,A.get(i));
                A.set(j++,A.get(i));
                i+=2;

            }
            else  if(i<n-1 && A.get(i)!=A.get(i+1))
            {
                A.set(j++,A.get(i));
                i+=1;
            }
            else
                i++;
        }
        return j;

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
