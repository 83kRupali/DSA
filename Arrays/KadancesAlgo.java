public class KadancesAlgo {

    // Time Complexity:O(n^3)

    public static void firstApproach(){
        int n = 5;
        int arr[] = {1,2,3,4,5};

        for(int st=0; st<n; st++){
            for(int end=0; end<n; end++){
                for(int i=st; i<=end; i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Brute force approach
    //Time Complexity:O(n^2)

    public static void subArraySum(){
        int n = 7;
        int arr[] = {3,-4,5,4,-1,7,-8};

        int maxSum = 0;

        for(int st = 0; st<n; st++){
            int currSum = 0;

            for(int end = st; end < n; end++){
                currSum += arr[end];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("MaxSum:"+maxSum);
    }

    // Kadance's Algorithm
    // Time Complexity -O(n)
    public static void subArraySum1(){
        int n = 7;
        int arr[] = {3,-4,5,4,-1,7,-8};

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Maximum Sum:"+maxSum);

    }
    public static void main(String[] args) {
        firstApproach();
        subArraySum();
        subArraySum1();
    }
}
