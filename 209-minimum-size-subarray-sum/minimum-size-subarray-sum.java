class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 1;
        int high = nums.length+1;
        int flag = 0;

        while(low<high){
            int mid = (low+high)/2;
            if(bs(mid, target, nums)){
                high = mid;
                flag = 1;

            }
            else
                low = mid+1;
        }

        if(flag == 0)
         return 0;

         return low;
    }

    public boolean bs(int size, int target, int nums[]){
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while(j < nums.length){
            sum +=nums[j];

            if(j-i+1==size){
                max = Math.max(max, sum);
                sum -= nums[i];
                i++;
            }
            j++;

            
            
            
        }
        if(max>=target)
                return true;
        return false;
    }
}