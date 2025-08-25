import java.util.ArrayList;

public class BellmanFord {
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

    // O(V*E)
    public static void bellmanFord(ArrayList<Edge>graph[], int src){
        int dist[] = new int[graph.length];

        for(int i=0; i<dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;

        // algo
        for(int i=0; i<V-1; i++){
            
            // edges - O(E)
            for(int j=0; j<graph.length; j++){

                for(int k=0; k<graph[j].size(); k++){  
                    Edge e = graph[j].get(k);

                    // u, v, wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxation
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        // print
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i] +" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];//null --> empty arraylist
        
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add(new Edge(0, 1, 2)); 
        graph[0].add(new Edge(0, 2, 4)); 
        
        //1 - vertex
        graph[1].add(new Edge(1, 2, -4)); 
      
        //2 - vertex
        graph[2].add(new Edge(2, 3, 2));
        
        //3 - vertex
        graph[3].add(new Edge(3, 4, 4)); 
        
        //4 - vertex
        graph[4].add(new Edge(4, 1, -1)); 

        //2's neighbours

        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);

            System.out.println(e.dest);
        }
        bellmanFord(graph, 0);
    }
}
