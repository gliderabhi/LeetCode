package FirstSets;

import java.util.*;

public class NOofFactors {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int t=0;t<test;t++){
                int nt = sc.nextInt();
                sc.nextLine();
                String[] vas = sc.nextLine().split(" ");
                HashMap<Integer, Integer> hs = new HashMap<>();
                for(String v : vas){
                   int n = Integer.parseInt(v);
                   while(n%2 ==0 ){
                       if(hs.containsKey(2)){
                           hs.put(2, hs.get(2)+1);
                       }else {
                           hs.put(2,1);
                       }
                       n/=2;

                   }
                   for(int i=3; i<=Math.sqrt(n);i+=2){
                       while(n%i ==0 ){
                           if(hs.containsKey(i)){
                               hs.put(i, hs.get(i)+1);
                           }else{
                               hs.put(i,1);
                           }
                           n/= i;
                       }
                   }
                }
                long prod =1;
                Iterator it = hs.entrySet().iterator();
                while(it.hasNext()){
                    Map.Entry mp = (Map.Entry) it.next();
                    prod *= ((int)mp.getValue()+1);
                }
                System.out.println(prod);

            }
        }
    }

}
