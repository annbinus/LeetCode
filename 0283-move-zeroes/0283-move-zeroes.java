class Solution {
    public void moveZeroes(int[] nums) {
        int right = 0;
        int left = 1;
       
        while(right<left && left<nums.length)
        {
            if(nums[right] == 0)
            {
                if(nums[left]!=0 )
                {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right++;
                }
                else{
                    left++;
                }
            }
            else{
                right++;left++;
            }
                
        }
    }
}