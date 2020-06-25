package FirstSets;

import java.util.Scanner;

public class GoodBadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            sc.nextLine();
            for(int p=0;p<t;p++){
                String cases = sc.nextLine();
                int i=0;
                boolean done = false;
                for( i=0;i<cases.length()-2;i+=3){
                    if(cases.charAt(i) == '0')
                        if(cases.charAt(i+1) == '1')
                            if(cases.charAt(i+2) == '0')
                            {    done = true;
                                System.out.println("Good");
                                break;
                            }
                    if(cases.charAt(i) == '1')
                        if(cases.charAt(i+1) == '0')
                            if(cases.charAt(i+2) == '1')
                            {    done = true;
                                System.out.println("Good");
                                break;
                            }

                }
                if(!done)
                    System.out.println("Bad");

            }
        }
    }
}
