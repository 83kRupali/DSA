import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        Pair(int v, int c){
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void primsAlgo(ArrayList<Edge>graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair>pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;     //MST cost/total min weight

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;
        
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("FinalCost(Min) cost of MST = "+finalCost);
    }

    public static void main(String args[]){

        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];//null --> empty arraylist
        
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add(new Edge(0, 1, 10)); 
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        //1 - vertex
        graph[1].add(new Edge(1,0, 10));
        graph[1].add(new Edge(1, 3, 40)); 

        //2 - vertex
        graph[2].add(new Edge(2, 0, 10)); 
        graph[2].add(new Edge(2, 3, 50));
        
        //3 - vertex
        graph[3].add(new Edge(3, 1, 40)); 
        graph[3].add(new Edge(3, 2, 50));


        //2's neighbours

        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);

            System.out.println(e.dest);
        }

        primsAlgo(graph);
    }
}
