package StackQues;

import java.util.Scanner;
import java.util.Stack;

public class RevString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s= scanner.nextLine();
        System.out.print(revString(s));
    }

    private static String revString(String s) {
        Stack<String> string = new Stack<String>();
        for(int i=0;i<s.length();i++){
            string.push(String.valueOf(s.charAt(i)));
        }
        String ret= "";
        while(!string.isEmpty()){
            ret+= string.peek();
            string.pop();
        }
        return ret;
    }
}
