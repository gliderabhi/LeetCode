import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class sumOfBitDiff {
    private static String bit(int n){
        String res ="";
        while(n>0){
            res+=n%2;
            n/=2;
        }
        return res;
//        HashSet<Integer> r = new HashSet<>();

    }
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> bits = new ArrayList<>();
        int n = 0;
        int test = 0;
        try {
            test = Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int t6 = 0; t6 < test; t6++) {
            try {
                n = Integer.parseInt(bf.readLine());
                int[] def = new int[n];
                String[] p = bf.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    def[i] = Integer.parseInt(p[i]);
                    bits.add(bit(def[i]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String t1 = bits.get(i);
                    String t2 = bits.get(j);
                    int t = 0;

                    while (t < t1.length() && t < t2.length()) {
                        if (t1.charAt(t) != t2.charAt(t)) {
                            ans++;
                        }
                        t++;
                    }
                   // System.out.println(t);
                    while (t < t1.length()) {
                        if (t1.charAt(t) == '1') {
                            ans++;
                        }
                        t++;
                    }
                    while (t < t2.length()) {
                        if (t2.charAt(t) == '1') {
                            ans++;
                        }
                        t++;
                    }
                   // System.out.println(t1 + " " + t2 + " " + ans);
                }
            }
            System.out.println(ans);
        }
    }
}
