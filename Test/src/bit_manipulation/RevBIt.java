package bit_manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class RevBIt {
    private static long rev(long r){
        ArrayList<Long> bits= new ArrayList<>();
        int k=0;

        long val = 0;
        while(r>0){
            bits.add(r%2);
            val+= (r%2) * Math.pow(2,31-k);
            r/=2;
            k++;
        }
       /* for(int i=k; i<32;i++){
            bits.add(0);
        }*/
        /*for(int i=0;i<k;i++){
         //   System.out.println(bits.get(i) + " "+ Math.pow(2,31-i));
            val+= bits.get(i)* Math.pow(2,31-i);
        }*/
        return val;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextLong();
        System.out.print(rev(n));
    }
}
