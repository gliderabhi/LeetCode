import java.util.ArrayList;

public class check {
     private static ArrayList<Integer> performOps(ArrayList<Integer> A) {
         ArrayList<Integer> B = new ArrayList<Integer>();
         for (int i = 0; i < 2 * A.size(); i++) B.add(0);
         for (int i = 0; i < A.size(); i++) {
             B.set(i, A.get(i));
             B.set(i + A.size(), A.get((A.size() - i) % A.size()));
             System.out.print(i + A.size() + " " + ((A.size() - i) % A.size()) + " ");
         }
         return B;
     }
        public static void main(String[] args){
            ArrayList<Integer> B = new ArrayList<Integer>();
            B.add(5);
            B.add(10);
            B.add(2);
            B.add(1);
           B = performOps(B);
           for(int i=0; i< B.size(); i++){
               System.out.println(B.get(i));
           }
        }
}
