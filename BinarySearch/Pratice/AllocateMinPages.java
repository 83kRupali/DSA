public class AllocateMinPages {

    public static int allocateMinPages(int arr[], int stu){
        int n = arr.length;
        if(n<stu){
            return -1;
        }
        int st = arr[0];
        int ans = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            st = Math.max(arr[i], st);
            sum += arr[i];
        }

        int end = sum;
        while (st<=end) {
            int mid = st + (end-st)/2;

            if(isPossible(arr, mid, stu)){
                ans = mid;
                end = mid-1;
            }

            else{
                st = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[],int mid, int stu){
        int pages = 0; int student = 1;

        for(int i=0; i<arr.length; i++){
            if(pages+arr[i]<mid){
                pages +=arr[i];
            }
            else{
                pages = arr[i];
                student++;
            }
        }
        // boolean reusult = student == stu ? true:false;
        return student <= stu ? true:false;
    }

    public static void main(String[] args) {
        int arr[] = {12,34,67,90};
        int stt = 3;
        System.out.println(allocateMinPages(arr, stt));

    }
}
