package SecondSets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int tes = sc.nextInt();
            for(int p=0;p<tes;p++){
                int n = sc.nextInt();
                int b = sc.nextInt();
                int m = sc.nextInt();
                int start = Integer.MAX_VALUE;
                int end = Integer.MIN_VALUE;
                ArrayList<Integer> possibleStarts = new ArrayList<>();
                for(int i=0;i<n;i+=3)
                    possibleStarts.add(i);
                int countLoad =0;
                for(int i =0; i<m;i++){
                    int v  = sc.nextInt();
                    if(v<=end && v>=start){
                        //then its ok
                    }else{
                        for(int j=0;j<possibleStarts.size();j++)
                        { int s = possibleStarts.get(j);
                          int e = s+b-1;
                          if(e>=n)
                              e = n-1;
                          if(v<=e && v>=s){
                              countLoad++;
                              System.out.println(v+ " "+ s+ " "+ e);
                              possibleStarts.remove(possibleStarts.indexOf(s));
                              start = s;
                              end = e;
                          }
                        }
                    }
                }
                System.out.println(countLoad);
            }
        }
    }
}
