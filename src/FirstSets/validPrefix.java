package FirstSets;

import java.util.Scanner;
import java.util.Stack;

public class validPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            sc.nextLine();
            for(int j=0;j<t;j++){
                String chars = sc.nextLine();
                Stack<Character> open = new Stack<>();
                int count = 0;
                if(chars.charAt(0) != '>')
                  for(char a : chars.toCharArray()){
                    if(a == '<')
                        open.add(a);
                    else if(!open.isEmpty()){
                        open.pop();
                        count+=2;
                    }else{
                        break;
                    }
                  }
                System.out.println(count);
            }
        }
    }
}
