package JioTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            sc.nextLine();
            for(int p=0;p<t;p++){
                String a = sc.nextLine();
                String b = sc.nextLine();
                HashSet<Character> bs = new HashSet<>();
                for(char b1 : a.toCharArray())
                    bs.add(b1);

                ArrayList<Character> c1 = new ArrayList<>();
                for(char a1: b.toCharArray())
                    if(!bs.contains(a1) && !c1.contains(a1))
                        c1.add(a1);

                Collections.sort(c1);
                if(c1.size()!=0) {
                    String res = "";
                    for (char v : c1)
                        res += v;

                    System.out.println(res);
                }else

                    System.out.println("-1");

            }
        }
    }
}
