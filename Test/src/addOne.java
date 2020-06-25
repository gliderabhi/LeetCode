import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class addOne {
    private static ArrayList<Integer> addOne(ArrayList<Integer> arr){
        ArrayList<Integer> r= new ArrayList<>();
        int i= arr.size()-1;
        int carry=0;
        if(arr.get(i) !=9){
            arr.set(i, arr.get(i)+1);
            if(arr.get(0)==0) {
                int start =0;
                while(arr.get(start)==0){
                    System.out.print("True \n");
                    arr.remove(start);
                }
            }
            return  arr;
        }else{
           while (arr.get(i)==9){
              if(i>0) {
                  arr.set(i, 0);
                  i--;
              }else{
                  r.add(1);
                  for(int p=0; p< arr.size(); p++)
                      r.add(0);

                  return r;
              }
           }
           arr.set(i, arr.get(i)+1);
           if(arr.get(0)==0) {
               int start =0;
              while(arr.get(start)==0){
                  System.out.print("True \n");
                  arr.remove(start);
              }
           }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ;i< n; i++){
            arr.add(scanner.nextInt());
        }
        arr= addOne(arr);
        for(int i=0;i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
