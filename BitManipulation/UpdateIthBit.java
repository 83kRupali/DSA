public class UpdateIthBit {

    public static int setIthBit(int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    public static int updateIthBit1(int n, int i, int newBit){
        n = clearIthBit(n, i);

        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        
        System.out.println(updateIthBit(10, 1, 1));
        System.out.println(updateIthBit1(10, 1, 1));
        // ans-10

        System.out.println(updateIthBit1(10, 2, 1));
        System.out.println(updateIthBit(10, 2, 1));
        // ans-14
    }
}
