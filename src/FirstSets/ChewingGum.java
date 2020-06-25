package FirstSets;

import java.util.Arrays;
import java.util.Scanner;

public class ChewingGum {
   static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int pairs = 0;
             int i=0;
             int j = n-1;
             while(i<j){
                 if(k-arr[i] > arr[j]) {
                     pairs += (j - i);
                     i++;
                 }
                 else
                     j--;
             }

            System.out.println(pairs);
        }
    }
}
