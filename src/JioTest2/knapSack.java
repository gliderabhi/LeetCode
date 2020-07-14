package JioTest2;

import java.util.Scanner;

public class knapSack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            for(int j=0;j<t;j++){
                int n = sc.nextInt();
                long c = sc.nextLong();
                long k = sc.nextLong();

                long[] ws = new long[n];
                for(int i=0;i<n;i++)
                    ws[i] = sc.nextLong();

              System.out.println(get(ws, k,c ));
            }
        }
    }


    private  static  long get(long[] arr, long k , long c  ){
         int size = 1;
         long max =0;
         int l =0;
         while(size<arr.length){
              for(int i=0;i<arr.length;i++){
                  long sum =0;
                  for(int j=0;j<size;j++){
                      if(i+j < arr.length)
                      sum+= arr[i+j];
                  }

                  if(sum > max){
                      max = sum ; l= size;
                  }
                  if(max == sum && l < size)
                      l = size;

                  System.out.println(sum  + " "+ max + " "+ l);
              }
              size++;
         }

         return  l;

    }


}
