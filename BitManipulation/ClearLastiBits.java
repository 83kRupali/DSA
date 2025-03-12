public class ClearLastiBits {

    public static int clearIthBit(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(~0);
        System.out.println(-1);

        System.out.println(clearIthBit(15, 2));
        //ans - 12

    }
}
