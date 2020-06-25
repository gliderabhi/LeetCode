import java.util.Scanner;

public class uniquePathsSum {
    private static int uniquePaths(int A, int B)
    {
        if(A==1 || B==1) return 1;
        else return uniquePaths(A-1, B) + uniquePaths(A, B-1);
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int m= scanner.nextInt();
        System.out.print(uniquePaths(n,m));
    }
}
