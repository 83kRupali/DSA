// Chatgpt but its easy
public static int minCost(int[] arr) {
        // code here
        int sum = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>((a, b) -> Integer.compare(a,b));
        
        for(int e:arr){
            pq.offer(e);
        }
        
        while(!pq.isEmpty() && pq.size() != 1){
            int one = (pq.isEmpty()) ? 0 : pq.poll();
            int two = (pq.isEmpty()) ? 0 : pq.poll();
            
            pq.offer(one+two);
            sum += (one+two);
        }
        
        return sum;
    }
