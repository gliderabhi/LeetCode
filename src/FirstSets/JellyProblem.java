package FirstSets;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class JellyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int test = sc.nextInt();
            for (int y = 0; y < test; y++) {
                int n = sc.nextInt();
                long U = sc.nextInt();
                int[] vs = new int[n];
                long a = 0, b = 0, c = 0, d = 0;
                for (int t = 0; t < n; t++) {
                    vs[t] = sc.nextInt();
                }
                double res = getOptimumSolution(vs,0,100000, U);

                DecimalFormat df = new DecimalFormat("#.###");
                df.setRoundingMode(RoundingMode.CEILING);

                System.out.println(df.format(res));
              // System.out.println(res);
            }
        }
    }

    static  double getOptimumSolution(int[] arr, double start, double end, long x) {
        int n = arr.length;
        double[] v2s = new double[n];
        double optimumValue = (start+end)/2;
        double sum =0;
        BigDecimal sums = new BigDecimal("0");
        if (end>=start) {
             optimumValue = start + (end - start) / 2;

            for(int i=0;i<arr.length;i++){
                v2s[i] = Math.pow(arr[i]+optimumValue , 3);
                sum+= v2s[i];
                sums.add(BigDecimal.valueOf((v2s[i])));
            }
            /*sum =  sums;
            if(sums.compareTo(BigDecimal.valueOf(x)))
            */
            if (sums.compareTo(BigDecimal.valueOf(x)) < 0.0001 && sums.compareTo(BigDecimal.valueOf(x)) >0)
                return optimumValue;

            if (sums.compareTo(BigDecimal.valueOf(x)) >0)
                return getOptimumSolution(arr, start, optimumValue , x);

            return getOptimumSolution(arr, optimumValue, end, x);
        }
        return start;


    }
}
