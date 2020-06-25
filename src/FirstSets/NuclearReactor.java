package FirstSets;

import java.util.Scanner;

public class NuclearReactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int A = sc.nextInt();
            int n = sc.nextInt();
            int k =sc.nextInt();
            int[] arr = new int[k];
            for(int i=0;i<A;i++){
                int r = 0;
                arr[r] +=1;
                while( arr[r] > n){
                    arr[r+1] +=1;
                    arr[r] =0;
                    r++;
                    if(r==n)
                        break;;
                }
            }
            for(int a : arr)
                System.out.println(a);
        }
    }
}
