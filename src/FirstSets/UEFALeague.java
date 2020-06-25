package FirstSets;

import java.util.*;

public class UEFALeague {
    public static class Teams implements Comparable<Object>{
       public String name ;
       public int goalsScored ;
       public int goalgave;
       public int win;

        public Teams(String name, int goalsScored, int goalgave, int win) {
            this.name = name;
            this.goalsScored = goalsScored;
            this.goalgave = goalgave;
            this.win = win;
        }

        @Override
        public int compareTo(Object o) {
            Teams t = (Teams) o;
            if(this.win != t.win)
             return t.win - this.win;
            else{
                return (t.goalsScored-t.goalgave) - (this.goalsScored - this.goalgave);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int te = sc.nextInt();
            sc.nextLine();
            for(int k=0;k<te;k++){
               HashMap<String, Teams> tems = new HashMap<>();
                for(int i=0;i<12;i++){
                    String[] input = sc.nextLine().split(" ");
                    String t1 = input[0];
                    int g1 = Integer.parseInt(input[1]);
                    int g2 = Integer.parseInt(input[3]);
                    String t2 = input[4];

                    if(g1> g2){
                        if(tems.containsKey(t1)) {
                            Teams temp = tems.get(t1);
                            temp.win += 3;
                            temp.goalsScored += g1;
                            temp.goalgave += g2;
                            tems.put(t1, temp);
                        }
                        else {
                            Teams temp = new Teams(t1, g1,g2, 3);
                            tems.put(t1, temp);
                        }



                        if(tems.containsKey(t2)) {
                            Teams temp = tems.get(t2);
                            temp.goalsScored += g2;
                            temp.goalgave += g1;
                            tems.put(t2, temp);
                        }
                        else {
                            Teams temp = new Teams(t2, g2,g1, 0);
                            tems.put(t2, temp);
                        }
                    }
                    else if(g2> g1){
                        if(tems.containsKey(t1)) {
                            Teams temp = tems.get(t1);
                            temp.goalsScored += g1;
                            temp.goalgave += g2;
                            tems.put(t1, temp);
                        }
                        else {
                            Teams temp = new Teams(t1, g1, g2, 0);
                            tems.put(t1, temp);
                        }



                        if(tems.containsKey(t2)) {
                            Teams temp = tems.get(t2);
                            temp.win+=3;
                            temp.goalsScored += g2;
                            temp.goalgave += g1;
                            tems.put(t2, temp);
                        }
                        else {
                            Teams temp = new Teams(t2, g2, g1, 3);
                            tems.put(t2, temp);
                        }

                    }else{
                        if(tems.containsKey(t1)) {
                            Teams temp = tems.get(t1);
                            temp.goalsScored += g1;
                            temp.win+=1;
                            temp.goalgave += g2;
                            tems.put(t1, temp);
                        }
                        else {
                            Teams temp = new Teams(t1, g1, g2, 1);
                            tems.put(t1, temp);
                        }



                        if(tems.containsKey(t2)) {
                            Teams temp = tems.get(t2);
                            temp.goalsScored += g2;
                            temp.goalgave += g1;
                            temp.win+=1;
                            tems.put(t2, temp);
                        }
                        else {
                            Teams temp = new Teams(t2, g2,g1, 1);
                            tems.put(t2, temp);
                        }

                    }

                }
                ArrayList<Teams> ts = new ArrayList<>();
                Iterator it = tems.entrySet().iterator();
                while (it.hasNext()){
                    Map.Entry mp = (Map.Entry) it.next();
                    Teams t = (Teams)mp.getValue();
                    ts.add(t);
                    System.out.println(t.name+ " "+t.win+ " "+ t.goalsScored+ " "+ t.goalgave);
                }

                Collections.sort(ts);
                System.out.print(ts.get(0).name + " " + ts.get(1).name );
            }
        }
    }
}
