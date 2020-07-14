package SecondSets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCallCounter {
    class RecentCall_Counter{
        Queue<Integer> callPing;
        RecentCall_Counter(){
            callPing = new LinkedList<>();
        }
        public int ping(int t){
            callPing.add(t);
            while (callPing.peek() < t-3000){
                callPing.poll();
            }
            return callPing.size();

        }
   }
}
