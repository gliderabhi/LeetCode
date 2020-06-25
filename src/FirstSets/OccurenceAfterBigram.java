package FirstSets;

import java.util.ArrayList;

public class OccurenceAfterBigram {

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        ArrayList<String > ret = solution(text,first,second);
        for(String a : ret)
            System.out.println(a);
    }
    private static ArrayList<String> solution(String text,String first, String second){
        ArrayList<String> ret = new ArrayList<>();
        String tog = first + " "+ second;
        String[] splitText = text.split(" ");
        for(int i=0;i<splitText.length-2;i++){
            if(splitText[i].equals(first))
                if(splitText[i+1].equals(second))
                    ret.add(splitText[i+2]);
        }

        String [] p = new String[ret.size()];
        int i=0;
        for(String g: ret){
            p[i] = g;
            i++;
        }
        return ret;
    }
}
