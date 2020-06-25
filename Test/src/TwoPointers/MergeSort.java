package TwoPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static  class merge {

        public merge(ArrayList<Integer> A) {
            getSortedArr(A, 0, A.size() - 1);
            print(A);
        }

        private void mergeArray(ArrayList<Integer> A, int start, int mid, int end) {
            int i = 0;
            int j = mid + 1;
            int nl = mid - start;
            int nr = end - mid;
            ArrayList<Integer> resp = new ArrayList<>();
            while (i <= nl && j <= nr) {
                if (A.get(i) < A.get(j)) {
                    resp.add(A.get(i));
                    i++;
                } else {
                    resp.add(A.get(j));
                    j++;
                }
            }
            while (i <= nl) {
                resp.add(A.get(i));
                i++;
            }
            while (j <= nr) {
                resp.add(A.get(j));
                j++;
            }
            A = resp;
        }

        private void getSortedArr(ArrayList<Integer> A, int l, int r) {
            if (l < r) {
                int m = l + (r - l) / 2;
                getSortedArr(A, l, m);
                getSortedArr(A, m + 1, r);
                mergeArray(A, l, m, r);
            }

        }

        private void print(ArrayList<Integer> A) {

            for (int i = 0; i < A.size(); i++) {
                System.out.print(A.get(i) + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }

        scanner.close();
        merge m = new merge(nums);
    }
}


