import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AcitivitySelection {

    public static void acitivitySelection(int start[], int end[]){
        //end time basis sorted
        int maxAct  = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){

                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = "+maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }


    public static void acitivitySelection1(int start[], int end[]){

        int activities[][] = new int[start.length][3];

        //sorting
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function --> shortform 
        // sort in end array
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct  = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];

        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){

                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max activities = "+maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }

    public static int acitivitySelection2(int start[], int finish[]){

        int n = start.length;
        
        // Create array of activity indices
        Integer[] indexArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexArr[i] = i;
        }

        // Sort indices based on finish times
        Arrays.sort(indexArr, (a, b) -> finish[a] - finish[b]);

        int maxActivity = 1;
        int lastEnd = finish[indexArr[0]];

        for (int i = 1; i < n; i++) {
            int index = indexArr[i];
            if (start[index] > lastEnd) { // if activity doesn't overlap
                maxActivity++;
                lastEnd = finish[index];
            }
        }

        return maxActivity;
    }
    public static void main(String[] args) {   //O(n)
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        acitivitySelection(start, end);
        acitivitySelection1(start, end);
        System.out.println(acitivitySelection2(start, end));
    }
}
