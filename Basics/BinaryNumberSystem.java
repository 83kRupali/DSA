/*
 * Binary Number System
 * 
 * # Decimal to Binary
 * psudo code:
 *   
 *   decNum --> decimal number
 *   ans = 0 ---> binary number
 *   pow = 1 
 *   while(decNum > 0){
 *      rem = decNum % 2
 *      decNum = decNum / 2
 *      ans += (rem * pow)
 *      pow *= 10
 *   } 
 *   return ans;
 * 
 * 
 * # Binary to Decimal
 * 
 *  1) remainder 
 *  2) ans += (rem * pow)
 *  3) num = num / 10    ---> update
 *  4) pow = pow * 2     ---> update
 * 
 *  binNum = 101
 *  ans = 0,  
 *  pow = 1  //2^0
 *  
 *  while(binNum > 0){
 *     rem = binNum % 10
 *     ans += (binNum*pow)
 *     binNum /= 10
 *     pow *= 2  
 *  }
 *  return ans
 *  
 */



public class BinaryNumberSystem {
    public static int decimalTobinary(int decNum){
        int ans = 0;
        int pow = 1;

        while(decNum>0){
            int rem = decNum % 2;
            decNum /= 2;
            ans += (rem * pow);
            pow *= 10;
        }
        return ans;
    }

    public static int binaryTodecimal(int binNum){
        int ans = 0, pow = 1;

        while(binNum > 0){
            int rem = binNum % 10;
            ans += (rem*pow);

            binNum /= 10;
            pow *= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Binary Number:"+decimalTobinary(5));
        System.out.println("Decimal Number:"+binaryTodecimal(101));
    }
}


