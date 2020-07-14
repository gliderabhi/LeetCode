package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class MatrixSim {
    static  class NumMatrix {
        int[][] dp;
        public NumMatrix(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            dp = new int[matrix.length + 1][matrix[0].length + 1];
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    dp[r + 1][c + 1] = dp[r + 1][c] + dp[r][c + 1] + matrix[r][c] - dp[r][c];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {

            return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        }
    }

    public static void main(String[] args) {
        int[][] m = {{}        };
        NumMatrix ms = new NumMatrix(m);
        System.out.print(ms.sumRegion(2,1,4,3));
    }
}
