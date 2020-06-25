import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Replace0With5 {
    public static void main(String[] args) {
        BufferedReader vf =new BufferedReader(new InputStreamReader(System.in));
        try{
        long d = Integer.parseInt(vf.readLine());
        String dr = String.valueOf(d);
        String res="" ;
        for(int i=0;i<dr.length();i++){
            if(dr.charAt(i)=='0'){
              res+="5";
            }else{
                res+=dr.charAt(i);
            }
        }

        System.out.print(res);

    }catch (Exception e) {
            e.printStackTrace();
        }
        }
}
