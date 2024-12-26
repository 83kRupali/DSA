import java.util.Arrays;

public class NextPermutation {

    //Next Permutation
    //Time complexity: O(n)

    public static void nextPermutation(){
        int arr[] = {1 ,2 ,3, 6, 5, 4};
        int n = arr.length-1;

        int pivot = -1;
        // 1st step: find the pivot
        for(int i=n-1; i>=0; i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            Arrays.sort(arr);
            return;
        }

        //2) next larger number

        for(int i=n; i>pivot; i--){
            if(arr[pivot] < arr[i]){
                int temp =arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        int i = pivot+1;
        int j= n;

        // 3) reverse the number after pivot : piv+1 to n
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k=0; k<=n; k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    
    public static void nextPermution(int A[]){
        //1st step: find the pivot

        int pivot = -1,  n = A.length-1;

        for(int i=n-1; i>=0; i--){
            if(A[i] < A[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            Arrays.sort(A);
            return;
        }

        //2) 2nd step: next larger element

        for(int i=n; i>pivot; i--){
            if(A[i] > A[pivot]){
                int temp = A[i];
                A[i] = A[pivot];
                A[pivot] =  temp;
                break;
            }
        } 

        //3) 3rd step: reverse (piv+1 to n-1)

        int i = pivot+1,  j = n;

        while (i <= j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

        for(int k=0; k<A.length; k++){
            System.out.print(A[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        nextPermutation();
        int arr[] = {2, 4, 1, 7, 5, 0};
        nextPermution(arr);
    }
}

