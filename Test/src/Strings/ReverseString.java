package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    private static String rev(String A){
        ArrayList<String> words = wordsArray(A);
        A= "";
        for(int i=words.size()-1; i>=0;i--){
            if(i==0) {
                A = A + words.get(i) ;
            }else {
                A = A + words.get(i) + " ";
            }
        }
        return A;
    }
    private static ArrayList<String> wordsArray(String A){
        int i=0;
        ArrayList<String> word=new ArrayList<>();
        int k=0;
        while(i<A.length()){
            String words ="";

              while ( i<A.length() && isLetterOrDigit(A.charAt(i)) ){
                   words+=A.charAt(i);
                  // System.out.print(" " + A.charAt(i));
                  i++;
              }
              word.add((words));
             i++;
        }

        return word;
    }
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(rev(str));
    }
}
