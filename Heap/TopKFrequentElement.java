import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    static class Pair implements Comparable<Pair>{
        int element;
        int freq;

        Pair(int ele, int freq){
            this.element = ele;
            this.freq = freq;
        }

        public int compareTo(Pair p2){
            return p2.freq - this.freq;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,1,3};
        int k = 2;

        PriorityQueue<Pair>pq = new PriorityQueue<>();
        HashMap<Integer, Integer>freqMap = new HashMap<>();
        
        // find freq of all elements

        for(int element : nums){
            freqMap.put(element,freqMap.getOrDefault(element, 0)+1);
        }

        // insert elements in pq
        for(Map.Entry<Integer, Integer>entry : freqMap.entrySet()){
            Pair pair = new Pair(entry.getKey(), entry.getValue());

            pq.offer(pair);
        }

        int res[] = new int[k];

        int idx = 0;
        while (idx < k) {
            res[idx] = pq.poll().element;
            idx++;
        }

        for(int i=0; i<k; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
