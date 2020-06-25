package recursion;

import java.util.Scanner;

public class powerMod {

    private static int Mod(int x, int p, int m){
        if(p==0){
            return 1;
        }else if(p%2==0){
            int y= Mod(x,p/2,m);
            return y*y% m;
        }else{
            return ((x%m ) *Mod(x,p-1,m))%m;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int pow = scanner.nextInt();
        int m= scanner.nextInt();
        System.out.print(Mod(n,pow,m));
    }
}
