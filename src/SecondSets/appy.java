package SecondSets;

import java.util.Scanner;

public class appy {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int v=0;v<t;v++){
                double n = sc.nextDouble();
                long a = sc.nextLong();
                long b = sc.nextLong();
                double k = sc.nextDouble();

                //nos divisible by a
                long  div1 = (long) (n/a);
                long div2 = (long) (n/b);
                long div3 = (long) (n/((a*b)/gcd(a,b)));
                if(div1 + div2 - 2*div3 >= k)
                    System.out.println("Win");
                else
                    System.out.println("Lose");
            }
        }
    }
    private static long gcd( long a,  long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
