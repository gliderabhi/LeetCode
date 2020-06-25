package TwoPointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortedArray {
    private static ArrayList<Integer> revrse(ArrayList<Integer> a){
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--){
            x.add(a.get(i));
        }
        return x;
    }
    private static ArrayList<Integer> merger(ArrayList<Integer> a, ArrayList<Integer> b){
        if(a.get(0)> a.get(1)){
            a= revrse(a);
        }
        if(b.get(0)>b.get(1)){
            b = revrse(b);
        }
        int i=0;
        int j=0;
        ArrayList<Integer> result= new ArrayList<>();
        while(i<a.size() && j< b.size()){
            if(a.get(i)< b.get(j)){
                result.add(a.get(i));
                i++;
            }else if(a.get(i)> b.get(j)){
                result.add(b.get(j));
                j++;
            }else{
                result.add(a.get(i));
                i++;j++;
            }

        }
        while(i<a.size()){
            result.add(a.get(i));
            i=i+1;
        }
        while(j<b.size()){
            result.add(b.get(j));
            j=j+1;
        }
        return result;
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
        nums= merger(nums,num2);
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i)+ " ");
        }

    }
}
