class GasStation{

    public static int gasStation(int gas[], int cost[]){
        
        int gasTotal = 0;
        for(int i: gas){
            gasTotal += i;
        }

        int costTotal = 0;
        for(int i: cost){
            costTotal += i;
        }

        if(gasTotal<costTotal){
            return -1;
        }


        int start =0;
        int currgas = 0;
        for(int i=0; i<gas.length; i++){
            currgas += (gas[i]-cost[i]);

            if(currgas < 0){
                start = i+1;
                currgas = 0;
            }
        }

        return start;
    }


    public static int gasStation1(int gas[], int cost[]){
        
        int gasTotal = 0;
        int costTotal = 0;
        
        int start =0;
        int currgas = 0;
        for(int i=0; i<gas.length; i++){
            gasTotal += gas[i];
            costTotal += cost[i];

            currgas += (gas[i]-cost[i]);

            if(currgas < 0){
                start = i+1;
                currgas = 0;
            }
        }

        return gasTotal < costTotal ? -1:start;

    }


    public static void main (String args[]){
        int gas[] = {1,2,4,5,9};
        int cost[] = {3,4,1,10,1};
        System.out.println(gasStation(gas, cost));
        System.out.println(gasStation1(gas, cost));
    }
}