import java.util.ArrayList;

public class SourcetoTarget {
     static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest=dest;
        }
    }

    public static void printAllPath(ArrayList<Edge>graph[], int src, int dest, String path){
        if(src == dest){
            System.out.println(path+dest);
            return;
        }

        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);

            printAllPath(graph, e.dest, dest, path+src+"->");
        }
    }

    public static void main(String args[]){


        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];//null --> empty arraylist
        
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        //2 - vertex
        graph[0].add(new Edge(0, 3)); 

        //2 - vertex
        graph[2].add(new Edge(2, 3)); 

        //3 - vertex
        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4, 0)); 
        graph[4].add(new Edge(4, 1)); 

        //5 - vertex
        graph[5].add(new Edge(5, 0)); 
        graph[5].add(new Edge(5, 2));

        //2's neighbours

        // for(int i=0; i<graph[2].size(); i++){
        //     Edge e = graph[2].get(i);

        //     System.out.println(e.dest);
        // }

        int src = 5, dest =1;
        printAllPath(graph, src, dest, " ");
    }
}
