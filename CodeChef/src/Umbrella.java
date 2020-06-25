import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Umbrella {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] p= new int[n];
        for(int i=0;i<n;i++){
            p[i]=Integer.parseInt(s.next());
        }
        int v = s.nextInt();
        System.out.println(countMin(p,v));
    }

    private static int countMin(int[] p, int v) {
        int c =0;
        Arrays.sort(p);
        if(p.length==0)
            return -1;

        int k= p.length-1;
        while(k>=0 && v>0){

            if(p[k]<=v){
                v-=p[k];c++;
                //System.out.println(v+ " "+ c);
            }else{
                k--;
            }
        }
        if(v!=0)
            return -1;
        return c;
    }
}
