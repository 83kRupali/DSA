public class Check2Power {

    public static boolean check2Power(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(check2Power(4));
        System.out.println(check2Power(16));
        System.out.println(check2Power(10));
        System.out.println(check2Power(8));
        System.out.println(check2Power(3));
        System.out.println(check2Power(2));
    }
}
