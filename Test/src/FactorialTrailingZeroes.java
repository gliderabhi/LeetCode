import java.util.Scanner;

public class FactorialTrailingZeroes {
    private static int getZeroes(int n){
        int x = 0;
        int count=1;
        while(n/(Math.pow(5,count)) >0){
            x+= n/(Math.pow(5,count));
            count++;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int n= scanner.nextInt();
        System.out.print(getZeroes(n));
    }
}
