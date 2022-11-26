package Graph;

import java.util.*;

public class BipartiteGraph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
    //0 -> vertex
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));

    //1 - > vertex
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 3));

    //2 - > vertex
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 4));

    //3 - > vertex
    graph[3].add(new Edge(3, 1));
    // graph[3].add(new Edge(3, 4));

    //4 - > veretx
    graph[4].add(new Edge(4, 2));
    // graph[4].add(new Edge(4, 3));
    }
    
    //O(V+E)
    public static boolean isBipartite(ArrayList<Edge> [] graph){
        int col[] = new int[graph.length];  //col = color
        for(int i = 0;i<col.length;i++){
            col[i] = -1; //no color = -1
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i =0;i<graph.length;i++){
            if(col[i] == -1){   //BFS
                q.add(i);
                col[i] = 0; //yellow
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j =0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j); //e.dest
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1: 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if(col[e.dest] == col[curr]){
                            return false; // NOT bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //IF graph doesn't have cycle then it is bipartite graph
        /*
                    0 ------- 2
                   /         /
                  /        /
                 1       4
                  \     /
                   \  /
                    3 
        //This is cycle graph
         Ans = false as it is non bipartite graph
         
                     0 ------- 2
                   /         /
                  /        /
                 1      

        //This is without cycle graph
        Ans = true = bipartite graph
        */

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
    
}
