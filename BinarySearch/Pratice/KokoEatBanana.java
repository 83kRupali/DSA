public class KokoEatBanana {

    //875 :koko eating bananas
    public static int kokoEatBanana(int arr[], int h){
        int st = 1;
        int end = arr[0];  //find the largest values of arr;

        //finding max
        for(int i=0; i<arr.length; i++){
            end = Math.max(st, arr[i]);
        } 

        int ans = 0;

        //apply binary search on the possible values of x -> (1, max(arr)) 
        while (st <= end) {
            int mid = st+(end- st)/2;

            if(isEatSpeedValue(arr, mid, h)){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid +1;
            }
        }
        return ans;
    }


    public static boolean isEatSpeedValue(int arr[], int mid, int h){
        int speed = 0;

        for(int i=0; i<arr.length; i++){
            speed += arr[i]/mid;

            if(arr[i] % mid != 0){
                speed += 1;
            }
        }

        if(speed > h){
            return false;
        }
        return true;

    }
    
    public static void main(String[] args) {
        int arr[] ={3,6,7,11};
        int h = 8;
        //ans = 4
        System.out.println(kokoEatBanana(arr, h));

    }
}
