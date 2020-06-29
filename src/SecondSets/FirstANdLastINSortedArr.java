package SecondSets;

public class FirstANdLastINSortedArr {
    public static void main(String[] args) {
        int[] n = {2,2};
        for(int a : searchRange(n,3))
        System.out.print(a + " ");
    }
    public  static  int[] searchRange(int[] nums, int target) {

        int p = binSearch(nums, 0, nums.length-1, target);
        int start = p;
        int end = p;
        if(p!=-1) {
            while ( start >= 0 && nums[start] == target)
                start--;
            while ( end < nums.length && nums[end] == target )
                end++;

            int[] a = new int[2];
            a[0] = ++start;
            a[1] = --end;

            return a;
        }else{
            int[] r = {-1,-1};
            return r;
        }
    }
    private static int binSearch(int[] arr, int start , int end , int x){
        if(end >= start){
            int mid = start + (end - start )/2;

            if(arr[mid] == x)
                return mid;

            if(arr[mid] < x)
                return    binSearch(arr, mid+1, end, x);

            return binSearch(arr, start, mid-1, x);

        }else return -1;
    }

}
