package SecondSets;

import java.util.*;

public class FibonaciString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int te = sc.nextInt();
            sc.nextLine();
            for (int p = 0; p< te; p++) {
                String v = sc.nextLine();
                HashMap<Character, Integer> hs = new HashMap<>();
                for (char a : v.toCharArray()) {
                    if (hs.containsKey(a))
                        hs.put(a, hs.get(a) + 1);
                    else
                        hs.put(a, 1);
                }
                if (hs.size() < 3)
                    System.out.println("Dynamic");
                else {
                    Iterator it = hs.entrySet().iterator();
                    ArrayList<Integer> list = new ArrayList<>();
                    int k =0;
                    while (it.hasNext()) {
                        Map.Entry mp = (Map.Entry) it.next();
                        list.add((int) mp.getValue());
                        k++;
                    }
                    Collections.sort(list);
                    int count = 1;

                    for (int j = 0; j < list.size() - 2; j++) {
                        if (list.get(j + 2) == list.get(j + 1) + list.get(j)){
                            count = 1;
                        } else{
                            count = 0;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Not");
                    } else {
                        System.out.println("Dynamic");
                    }

                }

            }
        }
    }
}
