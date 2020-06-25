import java.util.ArrayList;
import java.util.Scanner;

public class rotateMatrix {
    private static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> A){
         //int[][] replace = new int[A.size()][A.size()];
         ArrayList<ArrayList<Integer>> replace = new ArrayList<>();
         for(int i=0; i<A.size(); i++){

             replace.add(new ArrayList<>());
             for(int j=0;j<A.size(); j++) {
                 replace.get(i).add(0);
             }
         }
         int newi ;
         int newj;
        for(int i=0; i< A.size(); i++){
            for (int j=0; j< A.size(); j++){
                newi=j;
                newj= A.size()-i-1;
                replace.get(newi).set(newj,A.get(i).get(j));
            }
        }
        A= replace;
        return A;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int[][] matrix = new int[n][n];
        ArrayList<ArrayList<Integer>>  matrix =new ArrayList<>();
        for(int i=0; i<n; i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<n; j++){
                matrix.get(i).add(scanner.nextInt());
                //matrix[i][j]=(scanner.nextInt());
            }
        }
         scanner.close();
         matrix= rotate(matrix);
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
               System.out.print(matrix.get(i).get(j));
            }
            System.out.println();
        }
    }
}
