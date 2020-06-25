import java.util.Scanner;

public class Reverse_number {
    private static long pallindrome(long A){
        boolean neg = false;
        if(A>Integer.MAX_VALUE || A<Integer.MIN_VALUE){
            return 0;
        }
        if(A<0) {
            A *= -1;
            neg = true;
        }
            char[] num2 = String.valueOf(A).toCharArray();
            char[] num = new char[num2.length];
            int k=0;
            for(int i=num2.length-1;i>=0; i--) {
                num[k] = num2[i];
                k++;
            }
            if(neg) {
                if((Long.parseLong(String.valueOf(num)) * -1)< Integer.MIN_VALUE){
                    return 0;
                }else {
                    return Integer.parseInt(String.valueOf(num)) * -1;
                }
            }else{
                if((Long.parseLong(String.valueOf(num)))> Integer.MAX_VALUE){
                    return 0;
                }else {
                    return Integer.parseInt(String.valueOf(num)) ;
                }
            }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextLong();
            System.out.println(pallindrome(n));

    }
}
