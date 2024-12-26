import java.util.ArrayList;

public class ProductArrayExceptSelf {

    //238-Product of Array Except self
    // nums[] = {1,2,3,4};    ans = [24,12,8,6]
    public static void productArrayExceptSelf(){
        int nums[] = {1,2,3,4};

        int n = nums.length;
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            int prod = 1;
            for(int j=0; j<n; j++){
                if(i != j){
                    prod *= nums[j];
                }
            }
            ans.add(prod);
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    //Optimal solution
    //Time Complexity
    public static void productArrayExceptSelf1(){
        int nums[] = {1,2,3,4};

        int n = nums.length;

        int prefix[] = new int[n];
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        int suffix[] = new int[n];
        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(prefix[i]*suffix[i]);
        }
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    //Optimize solution
    //Time Complexity
    public static void productArrayExceptSelf2(){
        int nums[] = {1,2,3,4};

        int n = nums.length;
 
        int ans[] = new int[n];
        ans[0] = 1;
        
        //prefix ---> ans
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }

        //suffix --- ans
        int suffix = 1;
        for(int i=n-2; i>=0; i--){
            suffix *=nums[i+1]; 
            ans[i] *= suffix;
        }

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        productArrayExceptSelf();
        productArrayExceptSelf1();
        productArrayExceptSelf2();
        
    }
}
