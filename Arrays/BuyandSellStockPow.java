public class BuyandSellStockPow {

    //Compute x^n - 50
    //Binary Exponentiation
    // Time complexity : O(logn)

    public static void Computex_n(int x, int n){
        int binform = n;
        int ans = 1;

        while (binform > 0) {
            if(binform % 2 == 1){
                ans *= x;
            }

            x *= x;

            binform /= 2;  
        }
        System.out.println("x^n:"+ans);
    }

    // with all condition
    public static int Computex_n1(int x, int n){
        if(n == 0) return 1;

        if(x == 0) return 0;

        int binform = n;

        if(binform < 0){
            x = 1/x;
            binform = -binform;
        }

        int ans = 1;

        while (binform > 0) {
            if(binform % 2 == 1){
                ans *= x;
            }

            x *= x;

            binform /= 2;  
        }
        return ans;
    }

    public static void buyAndSell(){
        int prices[] = {7,1,5,3,6,4};

        int bestBuy = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;

        for(int i=1; i<prices.length; i++){
            if(prices[i]>bestBuy){
                maxprofit = Math.max(maxprofit, prices[i]-bestBuy);
            }
            bestBuy = Math.min(prices[i], bestBuy);
        }
        System.out.println("Max Profit:"+maxprofit);
    }
    public static void main(String[] args) {
        Computex_n(2, 3);
        System.out.println("x^n:"+Computex_n1(2, 3));
        buyAndSell();
    }
}
