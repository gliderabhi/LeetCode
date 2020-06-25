import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrettyNumbers {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(bf.readLine());
            for(int i=0;i<t;i++){
                String[] val = bf.readLine().trim().split(" ");
                int a = Integer.parseInt(val[0]);
                int b = Integer.parseInt(val[1]);
                System.out.println(a+ " "+b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
