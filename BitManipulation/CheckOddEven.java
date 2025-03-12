public class CheckOddEven {

    public static void checkOddEven( int n ){
        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("Even Number...");
        }
        else{
            System.out.println("Odd Number...");
        }
    }

    public static void main(String[] args) {
        checkOddEven(2);
        checkOddEven(12);
        checkOddEven(3);
        checkOddEven(5);
    }
}