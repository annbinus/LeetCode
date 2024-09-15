class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int far = 0, range = 0;
        
        if(nums.length==1) return count;
        for(int i =0; i< nums.length; i++){
            far = Math.max(i+nums[i], far);
            if(i==range)
                {
                    count++;
                    range = far;
                    if(range>=nums.length-1)
                        return count;
                }
        }
        return count;
        }
    
}