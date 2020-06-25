import java.util.ArrayList;
import java.util.Scanner;

public class maxAbsoluteDiff {
    private static int maxDiff(ArrayList<Integer>A){
        int diff = Integer.MIN_VALUE;
        for(int i=0,j=0;i<A.size();i++,j++){
                int i1= A.get(i)-i;
                int i2= A.get(j)-j;
                if(Math.max(i1,i2) >= diff){
                    diff = Math.max(i2,i1);
                }
                
                i1= A.get(i)+i;
                i2= A.get(j)+j;
                if (Math.max(i1,i2)>= diff){
                    diff = Math.max(i1,i2);
                }
            }

        return diff;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        ArrayList<Integer> A= new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(scanner.nextInt());
        }

        System.out.print(maxDiff(A));

    }
}
