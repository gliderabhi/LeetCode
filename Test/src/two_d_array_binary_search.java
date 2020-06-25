import java.util.ArrayList;
import java.util.Scanner;

public class two_d_array_binary_search {
    private static int getLocation(ArrayList<Integer> arr, int search) {
        int mid, start=0,count =0, end = arr.size()-1;
        int i=0;
        int j=0;
        while(start<=end){
            mid  = (start+end)/2;
            if(arr.get(mid)==search){

                return 1;
            }else if(arr.get(mid) > search){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return 0;
    }
    private static int Present_Y_N(ArrayList<ArrayList<Integer>> arr, int search){
        for(int i=0;i<arr.size();i++){
            if(getLocation(arr.get(i), search)==1) {
                return 1;
            }
        }
            return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int m= scanner.nextInt();
        for(int i=0; i<n; i++){
            arr.add(new ArrayList<>());
            for(int j=0;j<m; j++) {
                arr.get(i).add(scanner.nextInt());
            }
        }
        int search = scanner.nextInt();
        scanner.close();
        if(Present_Y_N(arr, search) == 0){
            System.out.println("Not found ");
        }else{
            System.out.print( Present_Y_N(arr,search));
        }
    }
}
