package StackQues;

import java.util.Scanner;
import java.util.Stack;

public class checkParanthesis {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s= scanner.nextLine();
        System.out.print(checkPranth(s));
    }

    private static int checkPranth(String s) {
        Stack<String> curl = new Stack<>();
        Stack<String> square= new Stack<>();
        Stack<String > simp= new Stack<>();

        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){

               simp.push(String.valueOf(s.charAt(i)));
           }else{
               if(!simp.isEmpty()){
                   simp.pop();
               }
           }

            if(s.charAt(i)=='{'){
                curl.push(String.valueOf(s.charAt(i)));
            }else{
                if(!curl.isEmpty()){
                    curl.pop();
                }
            }

            if(s.charAt(i)=='[' ){
                square.push(String.valueOf(s.charAt(i)));
            }else{
                if(!square.isEmpty()){
                    square.pop();
                }
            }
        }
      if(!curl.isEmpty()){
          return 1;
      }
      if(!square.isEmpty()){
          return 1;

      }
      if(!simp.isEmpty()){
          return 1;
      }
        return 0;
    }


}
