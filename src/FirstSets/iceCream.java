package FirstSets;

import java.util.HashMap;
import java.util.Scanner;

public class iceCream {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int t = sc.nextInt();
            //sc.nextLine();
            for(int p=0;p<t;p++){
                int n = sc.nextInt();
                sc.nextLine();
                //int[] arr = new int[n];
                boolean run = true;
                String [] vals = sc.nextLine().split(" ");

                HashMap<Integer, Integer> hs  = new HashMap<>();
                hs.put(5,0);hs.put(10,0);hs.put(15,0);
                for(int j=0;j<n;j++){
                    int v = Integer.parseInt(vals[j]);
                    int change = v-5;
                    hs.put(v, hs.get(v) + 1);
                    switch (change){
                        case 10: if(hs.get(10) ==0) {
                                     if(hs.get(5)<2){
                                         run = false;
                                         break;
                                     }else{
                                         hs.put(5, hs.get(5)-2);
                                     }
                                   }else
                                      hs.put(10, hs.get(10) -1);
                                break;
                        case 5: if(hs.get(5)==0){
                                      run =false; break;
                                }else
                                    hs.put(5, hs.get(5)-1); break;
                    }

                    //System.out.println(v);

                }

                if(run)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
