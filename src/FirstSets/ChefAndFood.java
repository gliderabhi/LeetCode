package FirstSets;

import java.util.Scanner;

public class ChefAndFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int k=0;k<t;k++){
                int n = sc.nextInt();
                int total = 0;
                for(int j=0;j<n;j++){
                    int s = sc.nextInt();
                    int v = sc.nextInt();
                    int p = sc.nextInt();
                    int actP = p/(s+1);
                    if(total< actP*v)
                         total = actP*v;
                }
                System.out.println(total);
            }
        }
    }
}
