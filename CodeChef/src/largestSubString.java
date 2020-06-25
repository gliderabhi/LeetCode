import java.util.HashSet;
import java.util.Scanner;

public class largestSubString {
    public static int lengthOfLongestSubstring(String A) {
        HashSet<String> res = new HashSet<>();
        int finaal = 0;
        int max =0;
        if(A.length()==1){
            return 1;
        }
        if(A.length()==0){
            return 0;
        }
        for(int j=0;j<A.length();j++){
            for(int i=j;i<A.length();i++){
                if(!res.contains(Character.toString(A.charAt(i)))){
                    finaal++;
                    res.add(Character.toString(A.charAt(i)));
                }else{
                    if(max<=finaal){
                        max=finaal;
                    }
                    finaal=0;
                    res.clear();
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(x));
    }
}
