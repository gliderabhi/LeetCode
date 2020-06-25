package FirstSets;

import java.util.Scanner;

public class PenaltyShootOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            for(int k=0;k<test;k++){
                int n = sc.nextInt();
                sc.nextLine();
                String penalties = sc.nextLine();
                int t1 =0;
                int t2 =0;
                int i=0;
                boolean completed = false;
                int shotsA = 0;
                int shotsB=0;
                int remA=n;
                int remB =n;
                for( i=0;i<penalties.length();i++){
                    if(i%2 ==0){
                        if(penalties.charAt(i) == '1')
                            t1++;
                        shotsA++;
                         remA= n-shotsA;
                        if(t1- t2 > remB)
                        {
                            completed = true;
                            System.out.println(i+1 );
                            break;
                        }
                        if(t2- t1 > remA)
                        {
                            completed = true;
                            System.out.println(i+1 );
                            break;
                        }
                    }
                    else{
                        if(penalties.charAt(i) == '1')
                            t2++;
                        shotsB++;
                        remB= n-shotsB;
                        if(t2- t1 > remA)
                        {
                            completed = true;
                            System.out.println(i+1 );
                            break;
                        }
                        if(t1- t2 > remB)
                        {
                            completed = true;
                            System.out.println(i+1 );
                            break;
                        }
                    }
                }
                if(!completed)
                System.out.println(i);
            }
        }
    }
}
