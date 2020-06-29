package SecondSets;

import java.util.Scanner;

public class TwoTanks {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++){
                long m =sc.nextLong();
                long tc =sc.nextLong();
                long th =sc.nextLong();

                int count =0;
                long i=0;/*
                for( i=m;i>0;i--) {
                    if (tc < th) {
                        tc += 2;
                        th -= 1;
                    }else if (tc > th) {
                        tc -= 1;
                        th += 2;
                    }else if(tc == th) {
                        //System.out.print(i);
                        break;
                    }
                }*/

                if((th - tc) % 3 !=0)
                    System.out.println("Yes");
                else
                {
                    if(m >= (th -tc )/3)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }

            }
        }
    }
}
