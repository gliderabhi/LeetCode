package FirstSets;

import java.util.Scanner;

public class Laddu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            sc.nextLine();
            for(int k=0;k<t;k++){
                String[] first  = sc.nextLine().split(" " );
                int act = Integer.parseInt(first[0]);
                String origin = first[1];
                int total = 0;
                for(int i=0;i<act;i++){
                    String[] inputs = sc.nextLine().split(" ");
                   // System.out.println(inputs[0]);
                    switch(inputs[0]){
                        case "CONTEST_WON" : int rank = Integer.parseInt(inputs[1]);
                            if(rank<=20){
                                total+= 300+ (20-rank);
                            }
                            break;
                        case "TOP_CONTRIBUTOR": total+=300; break;
                        case "BUG_FOUND" :  int sver = Integer.parseInt(inputs[1]); total+= sver; break;
                        case "CONTEST_HOSTED": total+= 50; break;
                    }

                }

                switch (origin){
                    case "INDIAN": System.out.println(total/200); break;
                    case "NON_INDIAN": System.out.println(total/400); break;
                }
            }
        }
    }
}
