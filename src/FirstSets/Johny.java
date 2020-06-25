package FirstSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Johny {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            for(int p=0;p<test;p++){
                int n = sc.nextInt();
                ArrayList<Integer> h = new ArrayList<>();
                for(int i=0;i<n;i++)
                    h.add(sc.nextInt());

                int k = sc.nextInt();
                int res = h.get(k-1);
                Collections.sort(h);
                System.out.println(h.indexOf(res)+1);


            }

        }
    }
}
