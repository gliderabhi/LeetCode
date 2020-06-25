package bit_manipulation;

import java.util.Scanner;

public class NumberOfOnes {
    private static int getOnes(int n){
        int ones = 0;
        while(n>0){
            System.out.print(n%2 + " " );
            if(n%2 ==1){
                ones++;
            }
            n/=2;
        }
        return ones;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.print(getOnes(n));
    }
}
