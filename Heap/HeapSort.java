
public class HeapSort {

    public static void heapify(int arr[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left < size && arr[left]>arr[maxIdx]){
            maxIdx = left;
        }

        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){

        //step1 - build maxHeap
        int n = arr.length;

        for(int i=n/2-1; i>=0; i--){
            heapify(arr, i, n);
        }

        // step2 - push largest at end

        for(int i=n-1; i>0; i--){

            //swap (largest-first with last)

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
}




/*
 * 
 * 
 * public void heapsort(int arr[]){
 *    int n = arr.length;
 * 
 *    for(int i = n/2-1; i>=0; i--){
 *        heapify(arr, i, n);   
 *    }
 *    
 *    for(int i=n-1; i>0; i--){
 *        int temp = arr[0];
 *        arr[0] = arr[i];
 *        arr[i] = temp;
 * 
 *        heapify(arr, 0, i);
 *    }
 * }
 * 
 * 
 * public void heapify(arr, i, size){
 *   int left = 2*i+1;
 *   int right = 2*i+2;
 *   int maxIdx = i;
 * 
 *   if(left < size && arr[left]>arr[maxIdx]){
 *      maxIdx = left;
 *   } 
 * 
 *   if(right < size && arr[right]>arr[maxIdx]){
 *      maxIdx = right;
 *   } 
 *   
 *   if(maxIdx != i){
 *      int temp = arr[maxIdx];
 *      arr[maxIdx] = arr[i];
 *      arr[i] = temp;
 * 
 *      heapify(arr, maxIdx, size);  
 * }
 */