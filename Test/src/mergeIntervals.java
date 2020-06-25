import java.util.ArrayList;
import java.util.Scanner;

public class mergeIntervals {
    public static class Interval {
       int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
   private static ArrayList<Interval> merge(ArrayList<Interval> A, Interval interval){
        int k=0,t=0;
        ArrayList<Interval> result = new ArrayList<>();
        Interval finalInterval= new Interval();
        if(interval.start<A.get(0).start){
            finalInterval.start= interval.start;
            int i=0;
            while(i<A.size()){
                if(A.get(i).start<interval.end){
                    if(A.get(i).end<interval.end){
                        i++;
                    }else{
                        finalInterval.end= interval.end;
                        result.add(finalInterval);

                    }
                }

            }
        }
        for(int i=0;i<A.size();i++){
            if(A.get(i).start< interval.start){
                if(A.get(i).end <interval.start){
                    result.add(A.get(i));
                }else{
                    finalInterval.start= A.get(i).start;
                    while(i<A.size()){
                        if(A.get(i).start<interval.end){
                            if(A.get(i).end<interval.end){
                                i++;
                            }else{
                                finalInterval.end= interval.end;
                                result.add(finalInterval);

                            }
                        }

                    }
                }
            }else{
                finalInterval.start=interval.start;
                while(i<A.size()){
                    if(A.get(i).start<interval.end){
                        if(A.get(i).end<interval.end){
                            i++;
                        }else{
                            finalInterval.end= interval.end;
                            result.add(finalInterval);
                            break;
                        }
                    }

                }
            }
        }
        if(result.size()==A.size()){
            result.add(interval);
        }
        return result;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Interval> x = new ArrayList<>();
        while(scanner.hasNext()){
            Interval newInt= new Interval(scanner.nextInt(),scanner.nextInt());
            x.add(newInt);
        }
        Interval checkInterval = x.get(x.size()-1);
        x.remove(x.size()-1);
        merge(x,checkInterval);
    }
}
