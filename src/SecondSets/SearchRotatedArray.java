package SecondSets;

public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] n = {4,5,6,7,0,1,2};
        System.out.print(search(n,0));
    }
    public static int search(int[] nums, int target) {

        int n = nums.length;
        int pos = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]> nums[i+1]){
                pos = i+1;
                break;
            }
        }

        //first half search
        int p1 = binSearch(nums,0, pos-1, target);
        System.out.print(p1);
        if(p1!=-1)
            return p1;
        int p2 = binSearch(nums,pos,n-1,target);
        System.out.print(p2);
        return p2;
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
