import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class TipletSumTONO {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(bf.readLine());
            for(int i=0;i<test;i++){
                String [] ns= bf.readLine().trim().split(" ");
                int n= Integer.parseInt(ns[0]);
                int k = Integer.parseInt(ns[1]);
                String [] m = bf.readLine().trim().split(" ");
                ArrayList<Integer> arr= new ArrayList<>();
                for(int j=0;j<m.length;j++){
                    arr.add(Integer.parseInt(m[j]));
                }
                int[] p = new int[4];
                HashSet<int [] > sums = new HashSet<>();
                for(int j=0;j<n;j++){
                    for(int t=j;t<n;t++){
                        p[0]=j;p[1]=t;p[3]=arr.get(j)+arr.get(t);
                        p[2]=0;
                        if(!sums.contains(p)){
                            sums.add(p);
                        }
                    }
                }
                int count =0;
                for(int j=0;j<n;j++){
                   p[3] = k-arr.get(j);
                    if(sums.contains(p[3])){
                        count++;
                        System.out.println(k-arr.get(j));
                    }
                }
                System.out.println(count);;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
