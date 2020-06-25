package binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class rotatedArray {
    private static int rotatedPos(ArrayList<Integer> arr, int search){
        int pos =0;
        int i=0;
        if(arr.get(0)<arr.get(1)) {

            while (arr.get(i) < arr.get(i + 1) && i < arr.size() - 1) {
                i++;
            }
           pos=i;
        }else{
            while (arr.get(i) > arr.get(i + 1) ) {
                i++;
                if(i==arr.size()-1){
                    break;
                }
            }
            pos=i;
        }

        if(arr.get(pos)== search){
            return pos;
        }else if(arr.get(pos) < search && arr.get(0)>search){

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0 ;i<n;i++){
            arr.add(scanner.nextInt());
        }

        System.out.print(rotatedPos(arr,scanner.nextInt()));
        scanner.close();
    }
}
