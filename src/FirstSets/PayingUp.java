package FirstSets;

import java.util.Scanner;

public class PayingUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int tes = sc.nextInt();
            for(int p=0;p<tes;p++){
                int n = sc.nextInt();
                int mug = sc.nextInt();
                int[] notes = new int[n];
                for(int i=0;i<n;i++)
                    notes[i] = sc.nextInt();
                boolean ans = check(notes, n-1, mug);
                if(ans)
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
        }
    }
    private static  boolean check(int[] arr , int endPoint, int sum ){
        if(sum == 0)
        {
            return true;
        }

        if(endPoint < 0 || sum <= 0)
        {
            return false;
        }
        if(arr[endPoint] <=  sum)
        {
            return ( check(arr,endPoint-1,sum) || check(arr,endPoint-1,sum-arr[endPoint]) );
        }
        else
        {
            return check(arr,endPoint-1,sum);
        }
    }
}
