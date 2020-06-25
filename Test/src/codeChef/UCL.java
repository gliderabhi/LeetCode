package codeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UCL {

    static ArrayList<String> teams;
    static ArrayList<team> Teams;
    static ArrayList<Integer> goalDiff;
    static ArrayList<Integer> point;

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCases = 0;
        teams = new ArrayList<>();
        goalDiff = new ArrayList<>();
        point = new ArrayList<>();
        Teams = new ArrayList<>();
        if (sc.hasNextLine())
            testCases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testCases; i++) {

            for (int j = 0; j < 12; j++) {

                String[] line = sc.nextLine().split(" ");
                String name1 = line[0], name2 = line[4];
                int score1 = Integer.parseInt(line[1]);
                int score2 = Integer.parseInt(line[3]);


                if(teams.indexOf(name1)==-1){
                    teams.add(name1);
                    goalDiff.add(0);
                    point.add(0);
                }
                if(teams.indexOf(name2)==-1){
                    teams.add(name2);
                    goalDiff.add(0);
                    point.add(0);
                }

                int index1 = teams.indexOf(name1);
                int index2 = teams.indexOf(name2);

                if(score1> score2){
                    int points = point.get(index1);
                    point.set(index1, points+3);
                }else if(score1< score2){
                    int points = point.get(index2);
                    point.set(index2, points+3);
                }else{
                    int points = point.get(index1);
                    point.set(index1, points+1);
                     points = point.get(index2);
                    point.set(index2, points+1);
                }

                int gd1 = goalDiff.get(index1);
                int gd2= goalDiff.get(index2);

                goalDiff.set(index1, gd1+score1-score2);
                goalDiff.set(index2, gd2+ score2 -score1);

            }

           getWinnerRunner();
        }
    }

    private static class team implements Comparable<team>{
        String name ;
        int goalDiff, point;
        team(String nm, int gd, int p){
            name = nm;
            goalDiff= gd;
            point = p;
        }

        @Override
        public int compareTo(team team) {
            if (point > team.point) return 1;
            else if (point < team.point) return -1;
            else if (goalDiff > team.goalDiff) return 1;
            else if (goalDiff < team.goalDiff) return -1;
            return 0;
        }
    }

    private static void getWinnerRunner() {

        for(int i=0;i<point.size();i++){
            team t1 = new team(teams.get(i),goalDiff.get(i),point.get(i));
            Teams.add(t1);
        }
        Collections.sort(Teams);
        System.out.print(Teams.get(Teams.size()-1).name + " "+ Teams.get(Teams.size()-2).name);
    }
}
