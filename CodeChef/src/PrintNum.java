import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNum {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] r = bf.readLine().trim().split(" ");
            System.out.println(r[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
