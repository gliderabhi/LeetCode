package SecondSets;

import java.util.HashSet;
import java.util.Iterator;

public class Trie {

    /** Initialize your data structure here. */
    HashSet<String> mp ;
    public Trie() {
        mp = new HashSet<>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        mp.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(mp.contains(word))
            return true;
        else return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        for (String v : mp) {
            if (v.startsWith(prefix))
                return true;
        }

        return false;
    }

}
