package FirstSets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MatchingBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Stack<Integer> open = new Stack<>();
        int maxDepth = 0;
        int maxDepthPos =0;
        int maxNo = 0;
        int maxPos  = 0;
        int c =0;
        ArrayList<Integer> cleans = new ArrayList<>();
        cleans.add(0);
        for(int k=0;k<test;k++){
            int a = sc.nextInt();
            if(a==1){
                if(open.isEmpty()){
                    if(c == 0)
                      maxPos = k;
                }
                else
                    c +=1;
                open.add(a);
                if(open.size()> maxDepth){
                    maxDepth = open.size();
                    maxDepthPos = k+1;
                }

            }else{
                open.pop();
                if(open.size() ==0 ){
                    cleans.add(k);
                    if(maxNo <c )
                        maxNo = c;
                    c=0;
                }
            }
        }

        int diff = Integer.MIN_VALUE;
        int maxPoint = 0;
        for(int i=0;i<cleans.size()-1;i++){
            if(cleans.get(i+1) - cleans.get(i) > diff){
                diff = cleans.get(i+1) - cleans.get(i);
                maxPoint = cleans.get(i);
            }
        }
        System.out.println(maxDepth+ " "+ maxDepthPos + " "+ diff + " "+ (maxPos-diff+1));
    }
}
