import java.util.Scanner;

public class binaryDivBy6 {

    public static void main(String[] args) {
        //time calculations
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        System.out.println(getBin(x));

        System.out.println(isDiv(x));

        long endTime   = System.nanoTime();
        double totalTime = (endTime - startTime)/Math.pow(10,9);
        System.out.println(totalTime);
    }

    private static boolean isDiv(long x) {
        String bin = getBin(x);
        boolean twodiv=false;
        boolean threeDiv=false;

        if(bin.charAt(0)=='0')
            twodiv=true;
        else
            return false;

        int sumOdd=0;
        int sumEven=0;
        for(int i=0;i<bin.length()-1;){
             sumEven+=Integer.parseInt(Character.toString(bin.charAt(i)));i++;
             sumOdd+=Integer.parseInt(Character.toString(bin.charAt(i)));i++;
        }
        System.out.println(sumEven+ " "+ sumOdd);
        if((sumEven-sumOdd)%3==0 )
            threeDiv=true;

        if(threeDiv && twodiv)
            return true;
        else
            return false;
    }

    private static String getBin(long x) {
        String b = "";
        while(x>0){
            b+=x%2;
            x=x/2;
        }
        return b;
    }
}
