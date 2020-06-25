package FirstSets;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class videoGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int stackNo = sc.nextInt();
            int height = sc.nextInt();
            ArrayList<Integer> stackList = new ArrayList<>();
            for(int i=0;i<stackNo; i++){
                int eachStackHeight = sc.nextInt();
                stackList.add(eachStackHeight);
            }
            sc.nextLine();
            String[] commands = sc.nextLine().split(" ");
            long currPos = 0;
            boolean containsBox = false;
            for(int i=0;i< commands.length;i++){
                switch (commands[i]){
                    case "0" : //end game
                                break;
                    case "1": //move left
                          if(currPos!=0)
                              currPos--;
                        break;
                    case "2": //move right
                            if(currPos!=stackNo-1)
                                currPos++;
                        break;
                    case "3": //pick up box
                          if(!containsBox) {
                              if (stackList.get((int) currPos) != 0) {
                                  containsBox = true;
                                  stackList.set((int) currPos, stackList.get((int) currPos) - 1);
                              }
                          }
                        break;
                    case "4": // drop box
                            if(height> stackList.get((int) currPos )  && containsBox ){
                                //then only drop or else dont
                                containsBox = false;
                                stackList.set((int) currPos, stackList.get((int)currPos)+1);
                            }
                        break;
                }
            }
            for(int v : stackList)
                System.out.print(v+ " ");
        }
    }
}
