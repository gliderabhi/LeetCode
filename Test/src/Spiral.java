import java.util.Scanner;

public class Spiral{
     public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[][] a = new int[n1][n2];
        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
              a[i][j] = scanner.nextInt();
            }

        }

        scanner.close();

        int i=0,j=0;
        int t=0, r = n2-1, b= n1-1, l=0;

        while(t<=b && l <= r){
            i=l;
            while (i<=r){
                System.out.print(a[t][i] + " " );i++;
            }
            t++;
            j=t;
            while(j<=b){
                System.out.print(a[j][r] + " ");j++;
            }
            r--;
            i=r;
            while(i>=l){
                System.out.print(a[b][i] + " ");i--;
            }
            b--;
            j= b;
            while(j>=t){
                System.out.print(a[j][l] +" "); j--;
            }
            l++;
        }

    }
}
