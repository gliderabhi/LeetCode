import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoOfBItsFlipped {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] r = bf.readLine().trim().split(" ");
            int a = Integer.parseInt(r[0]);
            int b= Integer.parseInt(r[1]);
            String bita= bits(a);
            String bitb= bits(b);
            if(bita.length()< bitb.length()){
                while(bita.length()<bitb.length()){
                    bita+="0";
                }
            }else if(bita.length()> bitb.length()){
                while(bita.length()>bitb.length()){
                    bitb+="0";
                }
            }
            System.out.println(bita + " "+ bitb);
            int flip =0;
            for(int i=0;i<bita.length();i++){
                if(bita.charAt(i)!=bitb.charAt(i)){
                    flip++;
                }
            }
            System.out.print(flip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String bits(int a){
        String r= "";
        while(a>0){
            r+= String.valueOf(a%2);
            a= a/2;
        }

        return r;
    }
}
