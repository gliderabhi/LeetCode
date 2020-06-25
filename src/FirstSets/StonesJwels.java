package FirstSets;

import java.util.HashSet;
import java.util.Scanner;

public class StonesJwels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int tes = sc.nextInt();
            sc.nextLine();
            for(int p=0;p<tes;p++){
                String jewl = sc.nextLine();
                HashSet<Character> jewls = new HashSet<>();
                for(int i=0;i<jewl.length();i++)
                    jewls.add(jewl.charAt(i));

                String mined = sc.nextLine();
                int count =0;
                for(int i =0;i<mined.length();i++){
                    if(jewls.contains(mined.charAt(i)))
                        count++;
                }

                System.out.println(count);
            }
        }
    }
}
