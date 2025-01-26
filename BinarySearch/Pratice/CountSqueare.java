public class CountSqueare {

    public static int sqrt(int x){
        int st = 1;
        int end = x;
        
        while (st <= end) {
            int mid = st +(end - st)/2;

            if(mid <= x/mid){
                if(x%mid == 0 && mid == x/mid){
                    return mid;
                }
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return st;
    }

    public static int countSqueare(int x){
        int sqroot = sqrt(x);
        return sqroot - 1;
    }
    public static void main(String[] args) {
        
    }
}
