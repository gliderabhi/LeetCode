package FirstSets;

import javax.swing.text.NumberFormatter;
import java.util.*;

public class topK {
    public static void main(String[] args) {
        /*int[] p = {1,1,1,2,2,3};
        int k =2;
        int[] v = getOut(p,k);
        for(int f: v){}
            //System.out.println(f);*/
        work();
    }

    private static void work(){
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        while (sc.hasNext()) {

            String inpt = sc.nextLine();
            boolean correct = true;
            for (int i = 0; i < inpt.length(); i++) {
                //Complete the code
                String input = Character.toString(inpt.charAt(i));
                if (input.equals("{") || input.equals("(") || input.equals("[")) {
                    stack.push(input);
                    //System.out.println("pushed "+ input);
                } else if (input.equals("}")) {
                    if (stack != null && stack.peek().equals("{")) {
                        stack.pop();
                    } else {
                        correct = false;
                        break;
                    }
                } else if (input.equals(")")) {
                    if (stack != null && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        correct = false;
                        break;
                    }
                } else if (input.equals("]")) {
                    if (stack != null && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        correct = false;
                        break;
                    }
                }
            }
            if (stack != null) correct = false;
            System.out.println(correct);
        }

    }
    private static int[] getOut(int[] p, int k) {
        int[] count = new int[10];

        for(int a : p){
            count[a]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<count.length;i++) {
            pq.add(count[i]);
            if(pq.size() > k)
                pq.poll();
        }
        Iterator it = pq.iterator();
        int i=0;
        while(it.hasNext()){
            System.out.println(it.next()+ " "+ i);
            i++;
        }

        return count;
    }
}
