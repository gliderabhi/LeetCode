import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {

    public static void main(String args[]) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);
        mergeIntervals(arr);
    }

    private static void mergeIntervals(Interval[] arr) {
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval interval, Interval t1) {
                return interval.start - t1.start;
            }
        });
        Stack<Interval> st= new Stack<>();
        int i=0;
        while(i<arr.length){
            if(st.isEmpty()){
                st.add(arr[i]);
            }else{
                Interval t = st.peek();
                if(t.end < arr[i].start){
                    st.push(arr[i]);
                }else{
                    if(t.end < arr[i].end){
                        t.end = arr[i].end;
                        st.pop();
                        st.push(t);
                    }
                }

            }
        }

    }

    static class Interval
    {
        int start,end;
        Interval(int start, int end)
        {
            this.start=start;
            this.end=end;
        }
    }

}
