public class SqrtX {

    //69 sqrt(x)
    public static int mysqrt(int x){
        int st = 1;
        int end = x;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(mid <= x/mid){
                if(x % mid == 0 && mid == x/mid){
                    return mid;
                }
                st = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        System.out.println(mysqrt(8));
    }
}
