import java.util.Scanner;

public class NCR {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         int r = sc.nextInt();
         int p = sc.nextInt();
         System.out.println(combin(n,r,p));

     }
    private static long combin(int n, int r, int p) {
        long[][] x = new long[n+1][r+1];
        x[n][0]=1;
        for(int i=0;i<=n;i++){
             for(int j=0;j<=Math.min(i,r);j++){
                 if(j==0 || j==i)
                     x[i][j]=1;
                 else
                 x[i][j]=  x[i-1][j]%p+ x[i-1][j-1]%p;

                 System.out.print(x[i][j]+ " ");
             }
             System.out.println();
         }
         return x[n][r];
    }
}
