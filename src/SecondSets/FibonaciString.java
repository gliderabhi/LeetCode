package SecondSets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FibonaciString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int te = sc.nextInt();
            sc.nextLine();
            for(int p=0;p>te;p++){
                String v = sc.nextLine();
                HashMap<Character, Integer> hs = new HashMap<>();
                for(char a : v.toCharArray()){
                    if(hs.containsKey(a))
                        hs.put(a, hs.get(a)+1);
                    else
                        hs.put(a,1);
                }
                if(hs.size() < 3)
                    System.out.println("Dynamic");
                else {
                    Iterator lop1, lop2;
                    lop1 = hs.entrySet().iterator();
                    lop2 = hs.entrySet().iterator();
                    
                }

            }
        }
    }
}
