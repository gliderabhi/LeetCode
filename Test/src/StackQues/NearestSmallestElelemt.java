package StackQues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallestElelemt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> nums  = new ArrayList<>();

        for(int i=0 ;i<n; i++){
           nums.add(scanner.nextInt());
        }
        ArrayList<Integer> res;
        res= getSmallestNum(nums);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+ " ");
        }
    }

    private static ArrayList<Integer> getSmallestNum(ArrayList<Integer> A) {
        Stack <Integer> stack = new Stack <> ();
        for (int i=0; i<A.size(); i++){
            int temp=A.get (i);
            if (stack.isEmpty()){
                stack.push (A.get (i));
                A.set (i, -1);
            }else if (stack.peek()<A.get(i)){
                //int temp = A.get (i);
                A.set (i, stack.peek());
                stack.push (temp);
            }else{
                while (!stack.isEmpty() && stack.peek()>=A.get(i)){
                    stack.pop();
                }
                if (stack.isEmpty()){
                    A.set (i, -1);
                }else{
                    //int temp = A.get (i);
                    A.set (i, stack.peek());
                    //stack.push(temp);
                }
                stack.push (temp);
            }
        }
        return A;
    }
}
