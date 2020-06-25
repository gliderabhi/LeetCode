package FirstSets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Poerty {
    public static  class Notebook implements  Comparable<Object>{
        int price;
        int pages ;
        Notebook(int p, int c){
            this.pages = p;
            this.price =c;
        }

        @Override
        public int compareTo(Object o) {
            Notebook n = (Notebook ) o;
            return  this.pages  - n.pages;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            for(int v=0;v<test;v++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int k = sc.nextInt();
                int n = sc.nextInt();
                int maxPages = 0;
                int j;
                boolean flag = false;
                ArrayList<Notebook> nts = new ArrayList<>();
                for ( j = 0; j < n; j++) {
                    int p = sc.nextInt();
                    int c = sc.nextInt();
                    if (p+y >= x && c<= k)

                        { System.out.println("LuckChef"); flag = true;}
                }
                if(flag){
                    System.out.println("LuckyChef");
                }else
                    System.out.println("UnLuckyChef");
            }

        }
    }
}
