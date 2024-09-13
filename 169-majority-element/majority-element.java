class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> entry = new HashMap<>();

        for(int i =0 ; i<nums.length; i++){
            entry.put(nums[i], entry.getOrDefault(nums[i], 0) +1);
        }

        int n = nums.length/2;

        for(Map.Entry<Integer, Integer> i: entry.entrySet()){
            if(i.getValue() > n){
                return i.getKey();
            }
        }
        return 0;
    }
}