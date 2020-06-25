package FirstSets;

import java.util.*;

public class sortByFreq {
    public static void main(String[] args) {
        String text = "tree";
        System.out.println(getFreq(text));
    }

    private static String getFreq(String text) {
        String fins = "";
        HashMap<Character,Integer> cCount = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            if(cCount.containsKey(c))
                cCount.put(c, cCount.get(c)+1);
            else
                cCount.put(c,1);
        }
        Iterator it = cCount.entrySet().iterator();
        ArrayList<ob> tot = new ArrayList<>();
        while(it.hasNext()){
            Map.Entry mp = (Map.Entry) it.next();
            ob o = new ob((char)mp.getKey(),(int) mp.getValue());
            tot.add(o);
        }
      //  Collections.sort(tot, Comparator.comparing());


        return fins;
    }

    private static class ob implements  Comparator<ob>{
        char cha;
        public int n;
        ob(char c, int n){
            this.cha = c;
            this.n = n;
        }

        @Override
        public int compare(ob o1, ob o2) {
            return o1.n - o2.n;
        }
    }
}
