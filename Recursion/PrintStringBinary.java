public class PrintStringBinary {

    public static void printStringBinary(int n, int lastplace, String str){

        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam 
        printStringBinary(n-1, 0, str+"0");

        if(lastplace == 0){
            printStringBinary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printStringBinary(4, 0, "");
    }
}
