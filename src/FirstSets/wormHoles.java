package FirstSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class wormHoles {
    public static  class Contest  implements  Comparable<Contest>{
        int start ;
        int end ;
        int dur ;

        public Contest(int start, int end) {
            this.start = start;
            this.end = end;
            this.dur = end-dur;
        }

        @Override
        public int compareTo(Contest o) {
            return this.dur - o.dur;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            ArrayList<Contest> cts = new ArrayList<>();
            for(int i=0;i<n;i++){
                int start = sc.nextInt();
                int end = sc.nextInt();
                Contest c = new Contest(start,end);
                cts.add(c);
            }
            int[] VWorm = new int[x];
            int[] WWorm = new int[y];
            for(int i=0;i<x;i++)
                VWorm[i] = sc.nextInt();
            for(int i=0;i<y;i++)
                WWorm[i] = sc.nextInt();

            Arrays.sort(VWorm);
            Arrays.sort(WWorm);
            Collections.sort(cts);
            int time =Integer.MAX_VALUE;
            for(Contest c : cts) {
                int st = c.start;
                int end = c.end;
                /*if (st >= VWorm[0]) {
                    if(end <= WWorm[y-1]) {
                        for (int i = 0; i < x; i++) {
                            if (VWorm[i] <= st) {
                                for (int j = 0; j < y; j++) {
                                    if (WWorm[j] >= end) {
                                        time = Math.min(time, WWorm[j] - VWorm[i] + 1);
                                    }
                                }
                            }
                        }
                    }
                }*/

                //use bainary search
                int v = binSearchLowerOfV(VWorm, 0,x-1, st);
                int w = binSearchUpeerOfW(WWorm, 0, y-1, end);

                time = Math.min(time , (WWorm[w] - VWorm[v] ));

            }

            System.out.println(time);

        }
    }
    public static int binSearchLowerOfV(int arr[],int left ,int right,int val){
        if(val<arr[0] || left>right)
            return -1;
        else{
            int mid =left+(right-left)/2;

            if(arr[mid]==val)
                return mid;
            if(arr[mid]>val)
                return binSearchLowerOfV(arr,left,mid-1,val);

            int some=binSearchLowerOfV(arr,mid+1,right,val);

            return some==-1?mid:some;
        }

    }

    public static int binSearchUpeerOfW(int arr[],int left ,int right,int val){
        if(val>arr[arr.length-1]||left>right)
            return -1;
        else{
            // System.out.println(left+" "+right);
            int mid =left+(right-left)/2;

            if(arr[mid]==val)
                return mid;
            if(arr[mid]<val)
                return binSearchUpeerOfW(arr,mid+1,right,val);

            int some=binSearchUpeerOfW(arr,left,mid-1,val);

            return some==-1?mid:some;
        }
    }
}
