package SecondSets;

import java.util.Scanner;
import java.util.Stack;

public class BackSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (char a : S.toCharArray()) {
            if (a == '#') {
                if (!s1.isEmpty())
                    s1.pop();
            } else {
                s1.push(a);
            }
        }
        for (char a : T.toCharArray()) {
            if (a == '#') {
                if (!s2.isEmpty())
                    s2.pop();
            } else {
                s2.push(a);
            }
        }
        if (s1.size() != s2.size())
            System.out.println("false");
        else {
            while (!s1.isEmpty() && !s2.isEmpty()) {
                if (s1.peek() != s2.peek()) {
                    System.out.println("false");
                    break;
                }
                s1.pop();
                s2.pop();

            }
            if (s1.isEmpty() && s2.isEmpty())
                System.out.println("true");

        }
    }
}
