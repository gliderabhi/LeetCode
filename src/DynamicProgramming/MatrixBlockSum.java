package DynamicProgramming;

public class MatrixBlockSum {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
        int k =1;
        m = matrixBlockSum(m,k);
        for(int i=0;i<m.length;i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
           System.out.println();
        }
    }

    private static int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] answer = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // now find the sum of blocks
                int sum = 0;
                for(int r=i-k;r<=i+k;r++){
                    for(int c = j-k;c<=j+k;c++ ){
                        if(r>=0 && c>=0 && r<n && c<m)
                           sum+=mat[r][c];
                    }
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
