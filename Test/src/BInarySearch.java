import java.util.ArrayList;
import java.util.Scanner;

public class BInarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
        }
        int search = scanner.nextInt();
        scanner.close();
        if(getLocation(arr, search) == -1){
            System.out.println("Not found ");
        }else{
            System.out.print( getLocation(arr,search));
        }
    }

    private static int getLocation(ArrayList<Integer> arr, int search) {
        int mid, start=0,count =0, end = arr.size()-1;
        int i=0;
        int j=0;
        while(start<=end){
            mid  = (start+end)/2;
            if(arr.get(mid)==search){
                count++;
                i=mid-1;
                j=mid+1;
                while(i>=0){
                    if(arr.get(i)==search){
                        count++;
                    }else{
                        break;
                    }
                    i--;
                }
                while(j<=arr.size()-1){
                    if(arr.get(j)==search){
                        count++;
                    }else{
                        break;
                    }
                    j++;
                }
                return count;
            }else if(arr.get(mid) > search){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return 0;
    }
}
