package FirstSets;

import java.util.Scanner;

public class Pair {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int test = sc.nextInt();
            sc.nextLine();
            for(int k=0;k<test;k++){
                String arr = sc.nextLine();
                char[] arrs = arr.toCharArray();
                int count =0;
                for(int i=0;i<arrs.length;i++){
                    if(arrs[i] == 'x'){
                        if(i+1<arrs.length && arrs[i+1] == 'y')
                        {
                            i+=2;
                            count++;
                        }
                    }else{
                        if(i+1<arrs.length && arrs[i+1] == 'x')
                        {
                            i+=2;
                            count++;
                        }

                    }


                }
                System.out.println(count);
            }
        }
    }
}
