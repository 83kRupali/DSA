
import java.util.PriorityQueue;

public class WeakestSoldier {

    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        Row( int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx;
            }
            else{
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                        {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                    };

        int k = 2;
      
        PriorityQueue<Row>pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            int count =0;

            for(int j=0; j<arr[0].length; j++){
                count+=arr[i][j] == 1 ? 1 : 0;
            }

            pq.add(new Row(count, i));
        }

        for(int i=0; i<k; i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
