package SecondSets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DiscStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int te = sc.nextInt();
            for(int p=0;p<te;p++){
                int n = sc.nextInt();
                ArrayList<Integer>  stackArrayList = new ArrayList<>();
                for(int i=0;i<n;i++){
                    int a = sc.nextInt();
                    boolean pushed = false;
                    for (Integer integers : stackArrayList) {
                        if (integers > a) {
                            stackArrayList.set(stackArrayList.indexOf(integers), a);
                            pushed = true;
                            break;
                        }
                    }
                    if (!pushed) {
                        stackArrayList.add(a);
                    }
                }
                System.out.print(stackArrayList.size()+ " ");
                for(Integer s : stackArrayList)
                    System.out.print(s+ " ");

                System.out.println();
            }
        }
    }
}
