import java.util.ArrayList;
import java.util.Scanner;

public class Spiral2{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.close();
        //System.out.println(n1);
        ArrayList<ArrayList<Integer> > a = new ArrayList<>();
        for(int p=0; p< n1; p++){
            a.add(new ArrayList<>());
            for(int h=0; h<n1; h++){
                a.get(p).add(0);
            }
        }

        int i=0,j=0;
        int t=0, r = n1-1, b= n1-1, l=0;
        int d=1;
        while(t<=b && l <= r){
            i=l;
            while (i<=r){
                //a[t][i] =d; d++; i++;
                a.get(t).set(i,d); d++; i++;
               // System.out.print(a[t][i] + " " );i++;
            }
            t++;
            j=t;
            while(j<=b){

                a.get(j).set(r,d); d++; j++;
               // a[j][r] =d; d++; j++;
                //System.out.print(a[j][r] + " ");j++;
            }
            r--;
            i=r;
            while(i>=l){

                a.get(b).set(i,d); d++; i--;
                //a[b][i] =d; d++; i--;
                //System.out.print(a[b][i] + " ");i--;
            }
            b--;
            j= b;
            while(j>=t){

                a.get(j).set(l,d); d++; j--;
                // a[j][l] =d; d++; j--;
               // System.out.print(a[j][l] +" "); j--;
            }
            l++;
        }

        for(i= 0; i< n1 ; i++){
            for(j=0;j<n1; j++){
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
