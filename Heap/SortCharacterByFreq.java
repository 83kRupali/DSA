import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFreq {

    static class Element implements Comparable<Element>{
        char ch;
        int freq;

        Element(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Element e2){
            return e2.freq - this.freq;
        }
    }
    public static void main(String[] args) {

        String str = "eebec";

        HashMap<Character, Integer>freqMap = new HashMap<>();

        for(char ch:str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(Map.Entry<Character, Integer>entry : freqMap.entrySet()){

            Element ele = new Element(entry.getKey(), entry.getValue());

            pq.offer(ele);
        }

        StringBuilder strr = new StringBuilder();

        while (pq.size() > 0) {
            Element ele = pq.poll();
            while (ele.freq>0) {
                strr.append(ele.ch);
                ele.freq--;
            }
        }
        System.out.println("String:"+strr.toString());
    }
}
