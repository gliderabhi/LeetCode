package Strings;

import java.util.Scanner;

public class AmazingSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        System.out.print(AmazingString(input));
    }

    private static int AmazingString(String input) {
        int c=0;
        input= input.toLowerCase();
        for(int i =0; i<input.length(); i++){
            if(isVoewl(input.charAt(i))){
                c+=input.length()-i;
            }
        }
        return c%10003;
    }

    private static boolean isVoewl(char charAt) {
        if(charAt== 'a' || charAt =='e' || charAt=='i' || charAt=='o' || charAt=='u'){
            return true;
        }else{
            return false;
        }
    }
}
