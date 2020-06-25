import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
    private static ArrayList<String> FizzBuzz (int A) {

        ArrayList<String> finl = new ArrayList<>();
        finl.add(String.valueOf(0));
        for (int i = 1; i <= A; i++) {
            finl.add(String.valueOf(i));
        }
        for (int i = 3; i <= A; i += 3) {
             finl.set(i,"Fizz");
        }
        for (int i = 5; i <= A; i += 5) {
            if(finl.get(i) == "Fizz") {
                finl.set(i, "FizzBuzz");
            }else{
                finl.set(i, "Buzz");
            }
        }

        return finl;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> re = FizzBuzz(n);
        for(int i=0;i<re.size(); i++){
            System.out.print(re.get(i) + " ");
        }
    }
}
