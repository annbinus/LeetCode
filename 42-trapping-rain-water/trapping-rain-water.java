class Solution {
    public int trap(int[] height) {
       int water = 0;
       int left = 0;
       int right =  height.length-1;
       int leftmax = height[left];
       int rightmax = height[right];

       while(left<right){
        if(height[left] <= height[right]){
            left++;
            leftmax = Math.max(height[left], leftmax);
            water += leftmax - height[left];
        }
        else{
            right--;
            rightmax = Math.max(height[right], rightmax);
            water += rightmax - height[right];
        }
       }

       return water;
    }
}