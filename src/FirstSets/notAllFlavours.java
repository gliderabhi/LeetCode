package FirstSets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class notAllFlavours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int k=0;k<t;k++){
                int n = sc.nextInt();
                int flavs = sc.nextInt();
                int[][] dp = new int[n+1][k+1];
                int[] vs = new int[n+1];
                for(int i=0;i<n;i++){
                    int v = sc.nextInt();
                    vs[i] = v;
                }
                int size = n;
                ArrayList<Integer> l1 = new ArrayList<>();
                ArrayList<Integer> l2 =new ArrayList<>();

               while(size >0){
                   for(int i=0;i<n;i++){
                       for(int m=0;m<flavs;m++)
                           l2.add(m+1);
                       for(int j=i;j-i<=size &&  i+size<n;j++){
                           if(j<n && l2.contains(vs[j]))
                           { l2.remove(l2.indexOf(vs[j])); System.out.print( vs[j] + " "+ j+ " ");}
                       }
                       System.out.println();
                       if(l2.size() >0 ){
                           System.out.println(size);
                           break;
                       }
                   }
                   System.out.println(size + " this size ");
                   size--;
               }
            }
        }
    }
}
