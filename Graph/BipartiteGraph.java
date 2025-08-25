import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BipartiteGraph {
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

    public static boolean isBipartite(ArrayList<Edge>graph[]){
        int col[] = new int[graph.length];

        for(int i=0; i<col.length; i++){
            col[i] = -1;    //no color
        }

        Queue<Integer>q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){      //BFS
                q.add(i);
                col[i] = 0;         // yellow
                       
                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);

                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1:0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]){
                            return false;        // Not bipartite
                        }
                    }
                }
                
            }
        }
        return false;
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
        System.out.println(isBipartite(graph));
    }
}
