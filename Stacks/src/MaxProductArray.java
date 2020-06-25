import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MaxProductArray {
    public static void main(String[] args) {
        BufferedReader vf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(vf.readLine());
            String [] t= vf.readLine().trim().split(" ");
            ArrayList<Integer> A= new ArrayList<>();
            for(int i=0;i<n;i++){
                A.add(Integer.parseInt(t[i]));
            }
            ArrayList<Integer> r=getProduct(A);
           for(int i=0;i<r.size();i++){
               System.out.print(r.get(i)+ " ");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> getProduct(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(A);
        long multiple = A.get(A.size()-1)*A.get(A.size()-2);
        for(int i=0;i<A.size();i++){
            System.out.print(A.get(i)+ " ");
        }
        if(multiple < A.get(0)*A.get(1)){
            res.add(A.get(0));
            res.add(A.get(1));
        }else{
            res.add(A.get(A.size()-2));
            res.add(A.get(A.size()-1));
        }
        return res;
    }
}
