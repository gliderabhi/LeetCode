package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Justifiedtext {
    public static ArrayList<String> fullJustify(ArrayList<String> A, int B) {
        int space =0;
        int len=B;
        int ltCount=0;
        ArrayList result=new ArrayList();
        ArrayList temp=new ArrayList();
        for(int i=0;i<A.size();i++){
            int t=0;
            int count=0;
            space=0;
            temp.clear();
            String ltr=A.get(i);
            count=ltr.length();
            temp.add(ltr);
            while(count<=B){
                space++;
                count++;
                if(i==A.size()-1){
                    t=0;
                    break;
                }
                i++;
                String mtr=A.get(i);
                count+=mtr.length();
                temp.add(mtr);
                t=1;
            }
            if(t==1){
                count-=A.get(i).length();
                temp.remove(temp.size()-1);
                space--;
                i--;
            }
            count--;
            int val=count-space;
            String calval="";
            int ecspace=0;
            if(space!=0)
                ecspace=(B-val)%space;
            int spreq=0;
            if(space!=0)
                spreq=(B-val)/space; if(i==A.size()-1){
                ecspace=0;
                spreq=1;
            }
            int k;
            for(k=0;k<temp.size();k++){
                calval+=temp.get(k);
                int p=0;
                if(k!=temp.size()-1){
                    while(p<spreq){
                        calval+=" ";
                        p++;
                    }
                }
                if(ecspace>0){
                    calval+=" ";
                    ecspace--;
                }
            } while(calval.length()<B){
                calval+=" ";
            } result.add(calval);
        }
        return result;

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        int n= scanner.nextInt();
        int l = scanner.nextInt();
        for(int i=0;i<n+1; i++){
            words.add(scanner.nextLine());
           // System.out.println(words.get(i));
        }

        ArrayList<String> r = fullJustify(words,l);
        for(int i=0;i<r.size(); i++){
            System.out.println(r.get(i));
        }
    }
}
