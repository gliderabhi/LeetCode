import java.util.ArrayList;
import java.util.Scanner;

public class Pallindrome {
    private static boolean pallindrome(long A){

       char[] num2 = String.valueOf(A).toCharArray();
       for(int i=0; i<String.valueOf(A).length()/2 ;i++){
           if(num2[i] != num2[String.valueOf(A).length()-1-i]){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextLong();
        if(pallindrome(n)){
            System.out.println("Pallindrome");
        }else {
            System.out.println("not pallindrome");
        }
    }
}
