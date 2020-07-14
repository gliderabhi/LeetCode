package JioTest2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsHeightsIQ {
  static class  Student implements Comparable<Student>{
        int h,iq;
        Student(int h, int iq){
            this.h = h;
            this.iq = iq;

        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public int getIq() {
            return iq;
        }

        public void setIq(int iq) {
            this.iq = iq;
        }

        @Override
        public int compareTo(Student o) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int t = sc.nextInt();
            for(int p=0;p<t;p++){
                int n = sc.nextInt();
                //ArrayList<Student> students = new ArrayList<>();
                int[] h = new int[n];
                int[] iq = new int[n];
                for(int i=0;i<n;i++)
                    h[i] = sc.nextInt();


                for(int i=0;i<n;i++)
                    iq[i] = sc.nextInt();

              /*  for(int i=0;i<n;i++){
                    Student s = new Student(h[i],iq[i]);
                    students.add(s);
                }*/
                int a1 = (longestIncreasingHeight(h, h.length));
                int a2 = (decreasingIq(iq, iq.length));
                System.out.println(Math.min(a1,a2));
            }
        }
    }
    static int longestIncreasingHeight(int arr[], int n)
    {
        int temp[] = new int[n];
        int i,j,max = 0;

        for ( i = 0; i < n; i++ )
            temp[i] = 1;

        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( arr[i] > arr[j] &&
                        temp[i] < temp[j] + 1)
                    temp[i] = temp[j] + 1;

        for ( i = 0; i < n; i++ )
            if ( max < temp[i] )
                max = temp[i];

        return max;
    }

    static int decreasingIq(int arr[], int n)
    {
        int DecreasingIq[] = new int[n];
        int i, j, max = 0;
        for (i = 0; i < n; i++)
            DecreasingIq[i] = 1;
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] < arr[j] &&
                        DecreasingIq[i] < DecreasingIq[j] + 1)
                    DecreasingIq[i] = DecreasingIq[j] + 1;

        for (i = 0; i < n; i++)
            if (max < DecreasingIq[i])
                max = DecreasingIq[i];

        return max;
    }
}
