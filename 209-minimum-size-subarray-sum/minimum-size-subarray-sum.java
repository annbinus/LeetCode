class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int mx = Integer.MAX_VALUE;

        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                sum -= nums[i];
                mx = Math.min(mx, j-i+1);
                i++;
            }
            j++;
        }
        if(mx ==  Integer.MAX_VALUE)
            return 0;

        return mx;
    }
}