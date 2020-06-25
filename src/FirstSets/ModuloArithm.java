package FirstSets;

import java.util.Scanner;

public class ModuloArithm {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                //System.out.println(arr[i]);
            }

            int query = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<query;j++){
                String[] qs = sc.nextLine().split(" ");
                switch(Integer.parseInt(qs[0])){
                    case 1:  int nI = Integer.parseInt(qs[1] );
                        arr[nI] = Integer.parseInt(qs[2] );
                        break;

                    case 2:  System.out.println(getOperation(arr,Integer.parseInt(qs[1] ), m));break;
                }

            }

        }
    }

    private static int getOperation(int[] arr, int v, int m){
        int count =0;
        for(int a: arr){
            if(a%m ==v )
                count++;
        }

        return count;
    }
}
