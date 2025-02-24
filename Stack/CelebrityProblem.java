import java.util.Stack;

public class CelebrityProblem {

    public static int celebrityProblem(int arr[][]){
        int n = arr.length; 

        Stack<Integer>st = new Stack<>();

        for(int i=0; i<n; i++){
            st.push(i);
        }

        while (st.size()>1) {
            int i = st.peek(); 
            st.pop();
            int j = st.peek(); 
            st.pop();
            

            if(arr[i][j] == 0){
                st.push(i);
            }
            else{
                st.push(j);
            }
        }

        int celeb = st.peek();

        for(int i=0; i<n; i++){
            if(i != celeb && (arr[i][celeb] == 0 || arr[celeb][i] == 1)){
                return -1;
            }
        }
        return celeb;
    }
    public static void main(String args[]){
        int arr[][] = {
                        {0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}
                    };

        System.out.println(celebrityProblem(arr));
    }
}
