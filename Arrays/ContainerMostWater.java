public class ContainerMostWater {

    // Container with Most Water
    // Brute Approach
    // Time Complexity: O(n^2)
    public static void MaxWaterContainer(){
        int height[] = {1,8,6,2,5,4,8,3,7};

        int n = height.length;

        int maxWater = 0;
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int w = j-i;
                int ht = Math.min(height[i], height[j]);

                int area = w * ht;
                maxWater = Math.max(area, maxWater);
            }
        }
        System.out.println("MaxWater:"+maxWater);
    }

    // Optimal Approach(2 pointer)
    // Time Approach - O(n)
    public static void MaxWaterContainer1(){
        int height[] = {1,8,6,2,5,4,8,3,7};

        int n = height.length;

        int maxWater = 0;
        int lp = 0;
        int rp = n-1;

        while (lp<rp) {
            int w = rp-lp;
            int ht = Math.min(height[rp], height[lp]);
            int area = w*ht;
            
            maxWater = Math.max(maxWater, area);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }   
        }
        System.out.println("MaxWater:"+maxWater);
    }

    public static void main(String[] args) {
        MaxWaterContainer();
        MaxWaterContainer1();
    }
}
