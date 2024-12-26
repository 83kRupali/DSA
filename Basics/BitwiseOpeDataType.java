public class BitwiseOpeDataType {
    public static void main(String[] args) {
        int a = 8;   //1000
        int b = 2;   //0010

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a^b);

        int c = 4;
        int d = c << 1;
        System.err.println("left Shift:"+d);

        int k = 10;
        int ans = k << 2;
        System.err.println("left Shift:"+ans);

        int ans1 = k>>1;
        System.err.println("right Shift:"+ans1);

        int ans2 = k>>2;
        System.err.println("right Shift:"+ans2);

        // Figure out how to find if a number is power of 2 with any loop
        int numm = 32;
        int value = 0;
        
        for(int i=0; i<32; i++){
            ans = 2 << i;
            if(ans == numm){
                value = i+1;
                break;
            }
            ans = 0;
        }

        System.out.println(value);
        
        // WAF to reverse an Integer n. 
 
        int num = 1234;

        int reverse = 0;

        while(num > 0){
            int rev = num % 10;
            reverse = reverse * 10 + rev;
            num /= 10;
        }
        System.out.println("Reverse Number:"+reverse);

    }
}


