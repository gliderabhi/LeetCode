package FirstSets;

import java.util.ArrayList;

public class KeyBoardRow {
    public static void main(String[] args) {
        String[] words = {"qz","wq","asdddafadsfa","adfadfadfdassfawde"};
        ArrayList<String> ret = getWords(words);
        for(String a : ret)
            System.out.println(a);
    }
    private static ArrayList<String> getWords(String[] arr){
        ArrayList<String> worss = new ArrayList<>();
        ArrayList<Character> l1 = new ArrayList<>();
        ArrayList<Character> l2 = new ArrayList<>();
        ArrayList<Character> l3 = new ArrayList<>();

        l1.add('q');l1.add('w');l1.add('e');l1.add('e');l1.add('r');l1.add('t');l1.add('y');l1.add('u');l1.add('i');l1.add('o');l1.add('p');
        l2.add('a');l2.add('s');l2.add('d');l2.add('f');l2.add('g');l2.add('h');l2.add('j');l2.add('k');l2.add('l');
        l3.add('z');l3.add('x');l1.add('x');l3.add('c');l3.add('v');l3.add('b');l3.add('n');l3.add('m');

        for(String a: arr){
            String v  = a.toLowerCase();
            char[] p = v.toCharArray();
            int row = 0;
            if(l1.contains(p[0]))
                row =1;
            if(l2.contains(p[0]))
                row =2;
            if(l3.contains(p[0]))
                row =3;

           // System.out.println(row);
            boolean ok = true;
            for(char t : p){
                if(row ==1)
                    if (!l1.contains(t)){
                        ok = false;
                    break;
                }
                if(row ==2)
                    if (!l2.contains(t)){
                        ok = false;
                   break;
                }
                if(row ==3)
                    if (!l3.contains(t)){

                        ok = false;
                 break;
                }
            }
            if(ok)
                worss.add(a);
        }
        String [] p = new String[worss.size()];
        int i=0;
        for(String g: worss){
            p[i] = g;
            i++;
        }
        return worss;
    }
}
