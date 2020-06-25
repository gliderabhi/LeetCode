package FirstSets;

import java.lang.reflect.Array;
import java.util.*;

public class uniqueOccurence {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,2,1,1,3};
        System.out.println(check(a));
    }
    private static boolean check(int[] arr){
        HashMap<Integer,Integer > hm = new HashMap<>();
        for(int a :arr){
            if(hm.containsKey(a))
                hm.put(a, hm.get(a)+1);
            else
                hm.put(a,1);
        }
        Iterator h = hm.entrySet().iterator();
        HashSet<Integer> c = new HashSet<>();
        while(h.hasNext()){
            Map.Entry map = (Map.Entry) h.next();
            int cs = (int) map.getValue();
            if(c.contains(cs))
                return false;
            else
                c.add(cs);
        }
        return true;
    }
}
