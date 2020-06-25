package FirstSets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int ts = sc.nextInt();
            for(int p=0;p<ts;p++){
                int n =sc.nextInt();
                sc.nextLine();
                    Stack<String> open = new Stack<>();
                    Stack<String> close = new Stack<>();
                    String c = sc.nextLine();
                    char[] chs = c.toCharArray();
                    for(char a : chs){
                        if(a == '(')
                            open.add(String.valueOf(a));
                        if(a == ')')
                            close.add(String.valueOf(a));
                    }
                    int count =0;
                    while(!open.isEmpty() && !close.isEmpty()){
                        count+=2;
                        open.pop();
                        close.pop();
                    }
                    System.out.println(count);

            }
        }
    }
}
