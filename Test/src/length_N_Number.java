import java.util.ArrayList;
import java.util.Scanner;

public class length_N_Number {
    private static int getIndex(ArrayList<Integer> num, int digit ){
        int i=0;
        for( i=0;i<num.size(); i++){
            if(num.get(i)>= digit){
                return i;
            }
        }
        return i;
    }
    private static long GetAllNums(ArrayList<Integer> nums, int size , int largeNum){

        long count = 0;
        if(nums.size()==0 || size ==0 || largeNum ==0){
            return 0;
        }
        if(String.valueOf(largeNum).length()< size){
            //all numbers larger than req no
            return 0;
        }else if (String.valueOf(largeNum).length() > size){
            //all numbers smaller than this largeNum
            return (long) Math.pow(nums.size(), size);
        }else {
            //numbers with req size
            char[] large_Num = String.valueOf(largeNum).toCharArray();
            int small_count = 0;
            int originalSize = size;
            if (nums.get(0) == 0) {
                while (size > 0) {
                    int p = getIndex(nums, Integer.parseInt(String.valueOf(large_Num[small_count])));
                    int r = 0;
                    if (originalSize == size) {
                        if(originalSize ==1){
                            r= p;
                        }else {
                            r = p - 1;
                        }
                    } else {
                        r = p;
                    }
                    if (r == nums.size()) {
                        count += (long) ((r) * Math.pow(nums.size(), size - 1));
                        System.out.println(r + " " + count);
                        break;
                    } else {
                        count += (long) ((r) * Math.pow(nums.size(), size - 1));
                        System.out.println(r + " " + count);
                        size--;
                        small_count++;
                    }

                }
            } else {

                while (size > 0) {
                    int p = getIndex(nums, Integer.parseInt(String.valueOf(large_Num[small_count])));
                    if (p == 0) {
                        return count;
                    } else {
                        if (p == nums.size()) {
                            count += (long) ((p) * Math.pow(nums.size(), size - 1));
                            break;
                        } else {
                            count += (long) (p * Math.pow(nums.size(), size - 1));
                            System.out.println(p + " " + count);
                            size--;
                            small_count++;
                        }
                    }
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> numbersListSorted = new ArrayList<>();
        for(int i=0; i<n;i++){
            numbersListSorted.add(scanner.nextInt());
        }
        int size = scanner.nextInt();
        int largeNum= scanner.nextInt();
        scanner.close();
        //System.out.print(getIndex(numbersListSorted,size));
        System.out.print(GetAllNums(numbersListSorted, size,largeNum));

    }
}
