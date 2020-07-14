package SecondSets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WordBreakFunction {
    public static  boolean wordBreak(String s, List<String> wordDict) {

        while(!s.equals("")){
            boolean split =false;
            for(String v : wordDict){
                if(s.contains(v))
                {
                    String [] st = s.split(v);
                    s = "";
                    for(String b: st)
                        s+=b;

                    split = true;
                    break;
                }
            }
            if(split == false)
                return  false;

        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> dict = new ArrayList<>();
        dict.add("car");dict.add("ca");
        dict.add("rs");
       System.out.println(wordBreak("cars",dict));
    }
}
