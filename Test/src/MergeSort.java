import java.util.ArrayList;

public class MergeSort {
    private static int getMax(int a, int b){
        String num = String.valueOf(a) + String.valueOf(b);
        String num2 = String.valueOf(b) + String.valueOf(a);
        long d = Integer.parseInt(num);
        long d2 = Integer.parseInt(num2);
        if(d>d2){
            return a;
        }else{
            return b;
        }
    }
    private static ArrayList<Integer> merge(ArrayList<Integer> a ,int start ,int mid , int end){
        ArrayList<Integer> result = new ArrayList<>();
        int nl= mid - start;
        int nr = end - start;
        int i=0,j=mid+1;
        while(i<= nl && j<=nr){
           if(getMax(a.get(i),a.get(j))==a.get(i)){
               result.add(a.get(i));
               i++;
           }else{
               result.add(a.get(j));j++;
           }
        }
        while(i<=nl){
            result.add(a.get(i));i++;
        }

        while (j<=nr){
            result.add(a.get(j));j++;
        }
        return result;
    }

    private static ArrayList<Integer> mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l+(r-l)/2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

           // merge(arr, l, m, r);
        }

        return (new ArrayList<>());
    }
    private static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
      return new ArrayList<>();
    }
    public static void main(String[] args) {
        ArrayList< Integer> a = new ArrayList<>();
        a.add(12);
        a.add(121);
        a.add(34);
        a.add(98);
        a.add(45);
        int k=0;
        while(k< a.size()){
            System.out.print(a.get(k)+ " ");k++;
        }
       a= merge(a,0,2,4);

        System.out.println();
        k=0;
       while(k< a.size()){
           System.out.print(a.get(k)+ " ");k++;
       }
    }
}
