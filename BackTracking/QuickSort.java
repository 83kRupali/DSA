public class QuickSort {

    // Time Complexity: 
    // 1) average/pratical case:O(nlogn)
    // 2) worst case : O(n^2)
    // Space Complexity: O(1)

    public static void quickSort(int arr[], int st, int end){
        if(st<end){
            int pivotIdx = partation(arr, st, end);
            quickSort(arr, st, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);
        }
    }

    public static int partation(int arr[], int st, int end){
        int idx = st-1,   pivotIdx = arr[end];

        for(int i=st; i<end; i++){
            if(arr[i]<pivotIdx){
                idx++;
                swap(arr,idx, i);
            }
        }
        
        idx++;
        swap(arr,idx, end);
        return idx;
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,6,4,1,3};
        quickSort(arr, 0, arr.length-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
