import java.util.ArrayList;

public class directedCycled {
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

    public static boolean isCycle(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){    //cycle
                 return true;
            }

            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }

        stack[curr] = false;
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
        System.out.println()
    }
}
