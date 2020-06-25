package FirstSets;

import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        int [] a = new int[] {2,1,2,5,3,2};
        System.out.println(repeat(a));
    }
    private static int repeat(int [] A){
        int c =0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int a: A){
            if(hash.containsKey(a)) {
                if(hash.get(a)+1 == A.length/2)
                    return a;
                hash.put(a, hash.get(a) + 1);
            }else{
                hash.put(a,1);
            }
        }
        return c;
    }
}
