class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] res = new int[nums.length];
        int pp = 1;
        int sp = 1;

        for(int i = 0; i< nums.length; i++){
            res[i] = pp;
            pp *= nums[i];
        }
        for(int i =nums.length-1; i>=0; i--){
            res[i] *= sp;
            sp *= nums[i];
        }
    return res;

        
    }
}