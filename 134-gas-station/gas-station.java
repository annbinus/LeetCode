class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, sum =0, position =0;

        for(int i = 0; i < gas.length; i++){
            sum += gas[i] - cost[i];

            if(sum < 0){
                total += sum;
                sum = 0;
                position = i +1;
            }
        }
        total += sum;

        if(total >=0)
            return position;
        else
            return -1;
    }
}