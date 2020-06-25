package graphs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
     static class Graph{
         int  V;
         LinkedList<Integer> addList[];

         Graph(int v){
             this.V= v;addList= new LinkedList[V];
             for(int i=0;i<V;i++){
                 addList[i]= new LinkedList<>();
             }
         }
         void addEdge(int v , int w){
             addList[v].add(w);
         }
         void BFS(int s){
             boolean visited[] = new boolean[V];
             //create que for Bfs
             LinkedList<Integer> que= new LinkedList<>();
             visited[s]= true;
             que.add(s);
             while(que.size()!=0){
                 s = que.poll();
                 System.out.print(s+" ");

                 Iterator<Integer> i = addList[s].listIterator();
                 while(i.hasNext()){
                     int n = i.next();
                     if(!visited[n]){
                         que.add(n);
                         visited[n]=true;
                     }
                 }
             }
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

            g.BFS(2);
    }
}
