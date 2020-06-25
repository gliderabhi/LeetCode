package Strings;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class CompareVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String version1= scanner.nextLine();
        String version2 = scanner.nextLine();
        System.out.print(compareVersion2(version1,version2));
    }

    private static int compareVersion2(String version1, String version2){
        for(int i=0, j=0;i<version2.length() || j<version1.length();i++,j++){
            String parts = "";
            while(i< version2.length() && version2.charAt(i)!='.' ){
                parts+=(version2.charAt(i));
                i++;
            }
            String part= "";
            while(j<version1.length() && version1.charAt(j)!='.'){
                part+=version1.charAt(j);
                j++;
            }
            if(part.length()==0){
                if(parts.charAt(0)=='0'){
                    return 0;
                }else {
                    return -1;
                }
            }
            if(parts.length()==0){
                if(part.charAt(0)=='0'){
                    return 0;
                }else {
                    return 1;
                }
            }
            if(part.charAt(0)=='0'){
                int h=0;
                while(h<part.length() &&part.charAt(h)=='0'){
                   h++;
                }
                String temp = "";
                while(h<part.length()){
                    temp+=part.charAt(h);
                    h++;
                }
                part= temp;
            }
            if(parts.charAt(0)=='0'){
                int h=0;
                while(h<parts.length() && parts.charAt(h)=='0'){
                    h++;
                }
                String temp = "";
                while(h<parts.length()){
                    temp+=parts.charAt(h);
                    h++;
                }
                parts= temp;
            }


          //  System.out.println(parts.length() + " "+ part.length());

            if(part.length() > parts.length()){
                return 1;
            }else if(part.length() < parts.length()){
                return -1;
            }else{
                int t=0,m=0;
                while(t < part.length()){
                    if(part.charAt(t)> parts.charAt(t)){
                        return 1;
                    }else if(part.charAt(t) < parts.charAt(t)){
                        return -1;
                    }

                    t++;
                }
            }
        }
        return 0;
    }
    private static int compareVersion(String version1, String version2) {

        ArrayList<Integer> versionParts1 = getNums(version1);
        ArrayList<Integer> versionParts2 = getNums(version2);
        if(versionParts1.size()<versionParts2.size()){
            for(int i=0; i< versionParts2.size()- versionParts1.size(); i++){
                versionParts1.add(0);
            }
        }
        if(versionParts1.size()>versionParts2.size()){
            for(int i=0; i< versionParts1.size()- versionParts2.size(); i++){
                versionParts2.add(0);
            }
        }
        int i=0;
        while(i< versionParts1.size() || i< versionParts2.size()){
            if(versionParts1.get(i) < versionParts2.get(i)){
                return -1;
            }else{
                if(versionParts1.get(i)> versionParts2.get(i)){
                    return 1;
                }
            }
            i++;
        }
        return 0;
    }

    public static ArrayList<Integer> getNums(String version2) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<version2.length();i++){
            String parts = "";
            while(i< version2.length() && version2.charAt(i)!='.' ){
                parts+=String.valueOf(version2.charAt(i));
                i++;
            }
            //  System.out.print(parts + " ");
            nums.add(Integer.valueOf(parts));
        }
        return nums;
    }
}
