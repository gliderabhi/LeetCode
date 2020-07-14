package DynamicProgramming;

public class countPallindrome {
    private static  int countPall(String s){
        int n = s.length();
        int count =0;
        int size =0;
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String ch = s.substring(i,j+1);
                if(checkPal(ch)) {
                    dp[i][j] = 1;
                    count++;
                }
            }
        }

        return count;
    }
    private static  boolean checkPal(String s ){
        int l =0;
        int r  = s.length()-1;
        while(r>=l){
            if(s.charAt(l)  != s.charAt(r))
                return false;
            l++;r--;
        }

        return true;
    }

    public static void main(String[] args) {
          System.out.print(countPall("abc"));
    }
}
