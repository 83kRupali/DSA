public class CountSetBitNumber {

    public static int countSetBitNumber(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countSetBitNumber(15));
        // 01111 = 4

        System.out.println(countSetBitNumber(16));
        // 10000 = 1
    }
}
