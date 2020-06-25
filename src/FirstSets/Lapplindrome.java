package FirstSets;

import java.util.*;

public class Lapplindrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int k=0;k<test;k++){
                String check = sc.nextLine();
                int length = check.length();
                HashMap<Character, Integer> left = new HashMap<>();
                HashMap<Character, Integer> right = new HashMap<>();

                    for (int i = 0; i < length / 2; i++) {
                        if (left.containsKey(check.charAt(i))) {
                            left.put(check.charAt(i), left.get(check.charAt(i)) + 1);
                        } else {
                            left.put(check.charAt(i), 1);
                        }
                    }
                    int start = 0;
                    if(length%2 ==0){
                        start = length/2;
                    }else{
                        start = length/2 +1;
                    }
                 for (int i = start; i < length; i++) {
                    if (right.containsKey(check.charAt(i))) {
                        right.put(check.charAt(i), right.get(check.charAt(i)) + 1);
                    } else {
                        right.put(check.charAt(i), 1);
                    }
                }

                 if(left.size() != right.size()){
                     System.out.println("NO");
                 }else {
                     Iterator iL = left.entrySet().iterator();
                     Iterator rL = right.entrySet().iterator();
                     boolean working = true;
                     while (iL.hasNext()){
                        Map.Entry mp1 =  (Map.Entry) iL.next();
                        //System.out.println(mp1);
                        if(right.containsKey((char)mp1.getKey())){
                            if(right.get(  (char) mp1.getKey()) != (int) mp1.getValue())
                            { working = false; }
                        }else
                        { working = false; }
                     }
                     if(working)
                         System.out.println("YES");
                     else
                         System.out.println("NO");
                 }
            }
        }
    }
}
