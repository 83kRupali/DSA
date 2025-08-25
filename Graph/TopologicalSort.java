import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

     static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest=dest;
            this.wt = wt; 
        }
    }

    public static void topSortDFS(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortDFSUtil(graph, i, vis, s);    //modified dfs
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop() +" ");
        }
        System.out.println();
    }

    public static void topSortDFSUtil(ArrayList<Edge>graph[], int curr, boolean vis[], Stack<Integer>s){

        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortDFSUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void calIndeg(ArrayList<Edge>graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(i);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSortBFS(ArrayList<Edge>graph[]){
        int indeg[] = new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer>q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();

            System.out.print(curr+" ");      // topological sort print

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }

        System.out.println();
    }
    public static void main(String args[]){

        /*
                       (5)
         *        0 --------- 1
         *                   /  \
         *              (1) /    \ (3)
         *                 /      \
         *                2 ------ 3 
         *                |  (1)
         *             (2)|
         *                |
         *                4
         */


        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];//null --> empty arraylist
        
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add(new Edge(0, 1, 5)); 

        //1 - vertex
        graph[1].add(new Edge(1,0, 5));
        graph[1].add(new Edge(1, 2, 1)); 
        graph[1].add(new Edge(1, 3, 3)); 

        //2 - vertex
        graph[2].add(new Edge(2, 1, 1)); 
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        
        //3 - vertex
        graph[3].add(new Edge(3, 1, 3)); 
        graph[3].add(new Edge(3, 2, 1));
        
        //4 - vertex
        graph[4].add(new Edge(4, 2, 2)); 

        //2's neighbours

        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);

            System.out.println(e.dest);
        }
        topSortDFS(graph);
      //  topSortBFS(graph);
    }
}
