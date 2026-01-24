 public int findTheWinner1(int n, int k) {

        if(k == 1) return n;

        Queue<Integer>q = new LinkedList<>();

        int count = 1;

        for(int i=1; i<=n; i++){
            if(count % k != 0){
                q.add(i);
                count++;
            }
            else{
                count = 1;
            }
        }

        while(q.size()>1){
            while(count < k){
                int rev = q.remove();
                q.add(rev);
                count++;
            }

            q.remove();
            count = 1;
        }

        return q.remove();
    }

    public int findTheWinner2(int n, int k) {
        if(n == 1){
            return 1;
        }
        int x = findTheWinner(n-1,k);
        int y = (x+k-1)%n+1;
        return y;
    }

     public int findTheWinner(int n, int k) {
        ArrayList<Integer> rem=new ArrayList<>();
        for(int i=0;i<n;i++){
            rem.add(i+1);
        }
        int i=0;
        while(rem.size()>1){
            int x=(i+k-1)%rem.size();
        
            rem.remove(x);
            i=x;
        }return rem.get(0);

    }
