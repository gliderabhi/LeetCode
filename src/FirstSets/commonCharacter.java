package FirstSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class commonCharacter {
    public static void main(String[] args) {
        String [] val = {"bella","roller","better"};
        ArrayList<Character > chs = getChars (val);
        //ArrayList<Character > chs = commonChars ("bella","roller");
        for(Character a: chs)
            System.out.println(a);
    }

    private static ArrayList<Character> commonChars (String s1, String s2){
        ArrayList<Character> c = new ArrayList<>();
        char[] s_one = s1.toCharArray();
        for(char a: s_one){
            c.add(a);
        }
        s_one = s2.toCharArray();
        ArrayList<Character> p = new ArrayList<>();
        for(char a: s_one){
            if(c.contains(a))
                p.add(a);
        }
        return p;
    }


    private static ArrayList<Character> getChars(String[] val) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        ArrayList<Character> finals = new ArrayList<>();
        ArrayList<Character> small = new ArrayList<>();
        for(int i=0;i<val.length-1;i++) {
            String s1 = val[i];
            String s2 = val[i+1];
             small = commonChars(s1,s2);
            if(i==0)
                finals = small;
            else{
                for(char t : finals){
                    if(!small.contains(t)){
                        //check count
                        finals.remove(finals.indexOf(t));
                    }
                }
            }

        }
        return finals;
    }
}
