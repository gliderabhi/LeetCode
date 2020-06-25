import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class maxUnsorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0;i<n;i++){
            r.add(s.nextInt());
        }
        ArrayList<Integer> res= subUnsort(r);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
    public static  ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int i=0;
        int n=A.size();
        int j= n-1;

        for( i=0;i<n-1;i++){
            if(A.get(i)>A.get(i+1)){
               System.out.println(i);
                break;
            }
        }
        ArrayList<Integer> r = new ArrayList<>();
        if(i==n-1){
            r.add(-1);
            return r;
        }
        for( j=n-1;j<=0;j--){
            if(A.get(j)<A.get(j-1)) {
              System.out.println(j);
               break;
            }

        }
        int max = A.get(i);
        int min = A.get(i);
        for(int t = i + 1; t <= j; t++)
        {
            if(A.get(t) > max)
                max = A.get(t);
            if(A.get(t) < min)
                min = A.get(t);
        }

        // step 2(b) of above algo
        for( int t = 0; t < i; t++)
        {
            if(A.get(t) > min)
            {
                i = t;
                break;
            }
        }

        // step 2(c) of above algo
        for( int t = n -1; t >= j+1; t--)
        {
            if(A.get(i) < max)
            {
                j = t;
                break;
            }
        }

        System.out.println(i+ " " + j);
        for(int t=i;t<=j;t++){
            r.add(A.get(t));
        }
        return r;
    }
}
