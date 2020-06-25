package TwoPointers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SortedArrayIntersection {
    private static ArrayList<Integer> intersection(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList iterList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        int[] arrA = new int[n];
        int[] arrB = new int[m];
        Iterator itA = A.iterator();
        Iterator itB = B.iterator();
        while (itA.hasNext()){
            arrA[i++] = (int) itA.next();
        }
        while (itB.hasNext()){
            arrB[j++] =(int) itB.next();
        }

        i = 0;  j = 0;
        while (!(i > n-1) && !(j > m -1)){
            if(arrA[i] == arrB[j]) {
                iterList.add(arrA[i]);
                i++;
                j++;
            }
            else if(arrA[i] > arrB[j])
                j++;
            else if(arrA[i] < arrB[j])
                i++;
        }
        return iterList;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> nums= new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(scanner.nextInt());
        }
        ArrayList<Integer> num2 = new ArrayList<>();
        int m= scanner.nextInt();
        for(int i=0;i<m;i++){
            num2.add(scanner.nextInt());
        }
        scanner.close();
       ArrayList<Integer> r= intersection(nums,num2);
        for(int i=0;i<r.size();i++){
            System.out.print(r.get(i)+ " ");
        }

    }
}
