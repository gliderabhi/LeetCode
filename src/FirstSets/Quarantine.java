package FirstSets;

import java.util.Scanner;

public class Quarantine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int te = sc.nextInt();
            for(int p=0;p<te;p++){
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                for(int i=0;i<n;i++)
                    for(int j=0;j<n;j++)
                        arr[i][j] = sc.nextInt();


                boolean safe = true;
                for(int i=1;i<n-1;i++) {
                    for (int j = 1; j < n - 1; j++) {
                        int a = arr[i][j];
                        if (a == 1) {
                            if (1 == arr[i][j + 1]) {
                                safe = false;
                                break;
                            }
                            if (1 == arr[i][j - 1]) {
                                safe = false;
                                break;
                            }
                            if (1 == arr[i + 1][j + 1]) {
                                safe = false;
                                break;
                            }
                            if (1 == arr[i + 1][j]) {
                                safe = false;
                                break;
                            }
                            if (1 == arr[i + 1][j - 1]) {
                                safe = false;
                                break;
                            }
                        }

                    }
                }

            }
        }
    }
}
