import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class nextLargestElement
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int test = 0;
        try {
            test = Integer.parseInt(bf.readLine());
            for(int j=0;j<test;j++) {
                int n=Integer.parseInt(bf.readLine());
                String[] rs= bf.readLine().split(" ");
                ArrayList<Integer> r = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    r.add(Integer.parseInt(rs[i]));
                }
                ArrayList<Integer> res = largestNext(r);
                for (int i = 0; i < res.size(); i++) {
                    System.out.print(res.get(i)+ " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static ArrayList<Integer> largestNext(ArrayList<Integer> r) {
        ArrayList<Integer> a = new ArrayList<>();
        int i=0;
        int max =r.get(r.size()-1);
        for(i=r.size()-1;i>=0;i--){
            if(r.get(i)==max){
                r.set(i,-1);
            }else{
                if(r.get(i)>max){
                    int temp = r.get(i);
                    r.set(i,max);
                    max= temp;
                }else{
                    if(r.get(i)<max){
                        r.set(i,-1);
                    }
                }
            }
        }
        return r;
    }
}
