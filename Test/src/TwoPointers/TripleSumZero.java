package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TripleSumZero {
    private static ArrayList<ArrayList<Integer>> TripleSumZero(ArrayList<Integer> A){
        int i;
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> negs= new ArrayList<>();
        for( i=0;i<A.size();i++){
            if(A.get(i)>=0){
                break;
            }
        }
        int k=i;
        if(i==0){
            return negs;
        }else{
          /*  int j=0;
            for(i=0;i<A.size();i++){
                for(j=i;j<A.size();j++) {
                    if (i != j) {
                        int d = A.indexOf((A.get(i) + A.get(j)) * -1);
                        if (d != -1 && d != i && d != j) {
                            ArrayList<Integer> r = new ArrayList<>();
                            r.add(A.get(i));
                            r.add(A.get(j));
                            r.add((A.get(i) + A.get(j)) * -1);
                            Collections.sort(r);
                            if (!negs.contains(r)) {
                                negs.add(r);
                            }
                        }


                    }
                }
            }*/
          while(k>=0){
              for(i= k+1 ; k<A.size(); ){
                  for(int j= A.size()-1; j>=k; ){
                      if((A.get(i) + A.get(j) +A.get(k)) == 0 ){
                          int d = A.indexOf((A.get(i) + A.get(j)) * -1);
                          if (d != -1 && d != i && d != j) {
                              ArrayList<Integer> r = new ArrayList<>();
                              r.add(A.get(i));
                              r.add(A.get(j));
                              r.add((A.get(i) + A.get(j)) * -1);
                              Collections.sort(r);
                              if (!negs.contains(r)) {
                                  negs.add(r);
                              }
                          }
                      }else{
                          if((A.get(i) + A.get(j) +A.get(k)) > 0){
                              j--;
                          }else{
                              i++;
                          }
                      }
                  }
              }
              k--;
          }
        }
        return negs;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(scanner.nextInt());
        }
        Collections.sort(A);
        scanner.close();
        ArrayList<ArrayList<Integer>> r= TripleSumZero(A);
        for(int i=0;i<r.size();i++){
            System.out.println(r.get(i).get(0) + " " + r.get(i).get(1) + " "+ r.get(i).get(2));
        }

    }
}
