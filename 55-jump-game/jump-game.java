class Solution {
    public boolean canJump(int[] nums) {
        int maxDistance = nums.length-1;

        for(int i = nums.length-2; i >=0; i--){
            if(i + nums[i] >= maxDistance){
                maxDistance = i;
            }  
        }
        if(maxDistance == 0)
            return true;
        else
        return false;
        
        
    }
}