import java.util.Collections;
import java.util.PriorityQueue;

public class IPO {

    static class Project implements Comparable<Project> {
        int profit;
        int capital;

        Project(int profit, int capital){
            this.profit = profit;
            this.capital = capital;
        }

        public int compareTo(Project p2){
            return this.capital - p2.capital;
        }
    }

    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        PriorityQueue<Project> minPQ = new PriorityQueue<>();
        int n = capital.length;

        //insert project in minPQ

        for(int i=0; i<n; i++){
            minPQ.offer(new Project(profits[i], capital[i]));
        }

        PriorityQueue<Integer>maxPQ = new PriorityQueue<>(Collections.reverseOrder());
            while(k>0){

                /*
                 * fill all projects whose capital is less than or equal to w
                 */

                while (!minPQ.isEmpty() && minPQ.peek().capital <= w) {
                    maxPQ.offer(minPQ.poll().profit);
                }

                if(maxPQ.isEmpty()) break;
                w+=maxPQ.poll();
                k--;
            }
        return w;
    }
    public static void main(String[] args) {
        int k =2;
        int w=0;
        int profit[] ={1,2,3};
        int capital[] = {0,1,1};
        System.out.println("Profit: "+findMaximizedCapital(k, w, profit, capital));
    }
}
