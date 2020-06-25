import java.util.ArrayList;
import java.util.Scanner;

public class MatrixZero {
    private static ArrayList<ArrayList<Integer>> setZero(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0; i<n ; i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<m; j++){
                if(matrix.get(i).get(j)==0){
                    if(!row.contains(i)){
                        for(int p=0; p<m ;p++){
                            matrix.get(i).set(p,0);
                        }
                        row.add(i);
                    }
                    if(!col.contains(j)){
                        for(int p=0; p<n ;p++){
                            matrix.get(p).set(j,0);
                        }
                        col.add(j);
                    }
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0; i<n ; i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<m; j++){
                matrix.get(i).add(scanner.nextInt());
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0;j<m; j++){
                System.out.print(matrix.get(i).get(j)+ " ");
            }
            System.out.println();
        }
       matrix = setZero(matrix,n,m);

        for(int i=0; i<n ; i++){
                     for(int j=0;j<m; j++){
                       System.out.print(matrix.get(i).get(j)+ " ");
            }
                     System.out.println();
        }
    }


}
