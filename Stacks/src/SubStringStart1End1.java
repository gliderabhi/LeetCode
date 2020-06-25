import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SubStringStart1End1 {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s= bf.readLine();
            int m=0;
            int i=0;
            for(i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    m++;
                }
            }
            System.out.print(m*(m-1)/2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
