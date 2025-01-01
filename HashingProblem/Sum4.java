//package Apna_College.HashingProblem;

public class Sum4 {

    //leetcode : 18

    //TC : O(nlogn+n^3)
    //SC : O(uniquegroup)
    
    public static void sum4(){
        int arr[] = {-2,-1,-1,1,1,2,2};
        int n = arr.length;
        int target = 0;
        

        for(int i=0; i<n; i++){
            // to avoid duplicate arr[i]
            if(i>0 && arr[i] == arr[i-1]) continue;

            for(int j=i+1; j<n;){
                int p=j+1,  q=n-1;

                while(p<q){
                    int sum = arr[i]+arr[j]+arr[p]+arr[q];
                    //long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    // This is also imp change in sum
                    if(sum > target){
                        q--;
                    }
                    else if(sum < target){
                        p++;
                    }
                    else{
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[p]+" "+arr[q]);
                        p++;  q--;

                        while(p<q && arr[p] == arr[p-1]){
                            p++;
                        }
                    }
                }

                j++;
                while (j<n && arr[j] == arr[j-1]) {
                    j++; 
                }
            }
        }
    }
    public static void main(String[] args) {
        sum4();
    }
}
