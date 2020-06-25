package TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class removeElementsFromArray {
    private static int remove(ArrayList<Integer> A, int r) {
        int size = A.size();
        int i = 0, j;
        for (i = 0, j = 0; j < A.size(); j++) {
            if (A.get(j) != r) {
                A.set(i, A.get(j));
                i++;
            }
        }
        int k=i;
        while(k<size){
            A.remove(k);
            size--;
        }
         return size;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> r = new ArrayList<>();
        for(int i=0;i<n;i++){
            r.add(scanner.nextInt());
        }
        int num = scanner.nextInt();
        scanner.close();
        System.out.print(remove(r,num));
    }
}
