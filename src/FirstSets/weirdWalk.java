package FirstSets;

import java.util.Scanner;

public class weirdWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<test;j++){
                int n = sc.nextInt();
                sc.nextLine();
                long da =0;
                long db =0;
                String[] va = sc.nextLine().split(" ");
                String[] vb = sc.nextLine().split(" ");
                long tog = 0;
                for(int i=0;i<n;i++){
                    da+= Integer.parseInt(va[i]);
                    db+= Integer.parseInt(vb[i]);

                    if(da == db   && va[i].equals(vb[i]))
                        tog+= Integer.parseInt(va[i]);
                }
                System.out.println(tog);
            }
        }
    }
}
