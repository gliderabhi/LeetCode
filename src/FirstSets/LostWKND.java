package FirstSets;

import java.util.Scanner;

public class LostWKND {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<test;j++){
                String[] hrs = sc.nextLine().split(" ");
                int p = Integer.parseInt(hrs[5]);
                int sum =0;
                for(int i=0;i<5;i++){
                    sum+= Integer.parseInt(hrs[i]);
                }
                if(sum*p >= 24*5)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }

        }
    }
}
