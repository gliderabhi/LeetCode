package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    static class Graph{
        int V;
        LinkedList<Integer> addList[];
        boolean visit[];
        Graph(int v){
            this.V= v;
            visit = new boolean[V];
            addList = new LinkedList[v];
            for(int i=0;i<V;i++){
                addList[i]= new LinkedList<>();
            }
        }

        void addEdge(int s, int w){
            addList[s].add(w);
        }

        int DFS(int s){
            visit[s]= true;
            int c =0;
            //System.out.print(s+ " ");
            Iterator<Integer> i = addList[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                while(!visit[n]){
                    DFS(n);
                    c++;
                }
            }

            return c;
        }
        void setVisit(){
            for(int i=0;i<V;i++)
                visit[i]=false;
        }
    }
    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        int v =0;
        ArrayList<Integer> mother = new ArrayList<>();
         for(int i=0;i<3;i++){
             g.setVisit();
             int t = g.DFS(i);
             if(v<t){
                 mother = new ArrayList<>();
                 mother.add(i);
                 v= t;
             }else if(v==t)
                 mother.add(i);
         }
        ;System.out.println();
         for(int i=0;i<mother.size();i++)
             System.out.print(mother.get(i));
    }
}
