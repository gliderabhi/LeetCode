package FirstSets;

import java.util.Scanner;

public class maxSpeeds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int test = sc.nextInt();
            for(int k=0;k<test;k++){
                long  n = Long.parseLong(sc.nextLine());
                int count =0;
                long maxPrev=0;
                for(int i=0;i<n;i++){
                    long  speed = Long.parseLong(sc.nextLine());
                    if(maxPrev == 0 || maxPrev >=speed) count++;
                    maxPrev = speed;

                }
                System.out.println(count);
            }
        }
    }
}
