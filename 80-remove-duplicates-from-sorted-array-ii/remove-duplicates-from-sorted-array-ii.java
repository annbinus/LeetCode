class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int flag = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                flag++;
            }
            else
                flag = 0;

            if(flag <=1)
            {
                nums[count] = nums[i];
                count++;
            } 
        }
        return count;
    }
}