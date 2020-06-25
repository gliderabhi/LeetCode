package FirstSets;

import java.util.Arrays;
import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int p=0;p<test;p++){
                String num = sc.nextLine();
                char[] vs = num.toCharArray();

                int i=0, j = num.length()-1;
                while(i<=j){
                    if(vs[i] < vs[j]){
                        if(vs[j]!='9')
                          vs[j-1]+=1 ;
                        else{

                        }
                        vs[j] =vs[i];
                    }else{
                        vs[j] =vs[i];
                    }

                    i++;j--;
                }
                num = vs.toString();
                System.out.println(num);


            }


        }

    }
}
