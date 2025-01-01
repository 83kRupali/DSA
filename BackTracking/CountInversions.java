import java.util.ArrayList;

public class CountInversions {

    public static int countInversions(int arr[]){
        int invCount = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    invCount++;
                }
            }
        } 
        return invCount;
    }

    public static int countInversions1(int arr[], int st, int end){
        if(st<end){
            int mid = st+(end-st)/2;

           int leftcountInv = countInversions1(arr, st, mid);
           int rightcountInv = countInversions1(arr, mid+1, end);

            int countInv =  merge(arr,st, mid, end);

            return leftcountInv+rightcountInv+countInv;
        }
        return 0;
    }

    public static int merge(int arr[], int st, int mid, int end){
        ArrayList<Integer>temp = new ArrayList<>();
        int countInv = 0;
        int i = st,  j=mid+1;
        while(i <= mid && j <=end){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                countInv += (mid-i+1);
                j++;
            }
        }

        while (i<=mid) {
            temp.add(arr[i]);
            i++;
        }

        while (j <=end) {
            temp.add(arr[j]);
            j++;
        }

        for(int idx=0; idx<temp.size(); idx++){
            arr[idx+st] = temp.get(idx);
        }
        return countInv;
    }
    public static void main(String[] args) {
    //int arr[] = {6,3,5,2,7};   //5
        int arr[] = {1,3,5,10,2,6,8,9}; //6
       System.out.println("Inversion Count:"+countInversions(arr));
       System.out.println("Inversion Count:"+countInversions1(arr,0,arr.length-1));
    }
}