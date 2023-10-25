class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
        int count = 0;
        
        for (int i : nums)
        {
            if(num.containsKey(k-i))
            {
                count++;
                if(num.get(k-i) == 1)
                    num.remove(k-i);
                else
                    num.put(k-i, num.get(k-i) - 1);
            }
            else
            {
                num.put(i, num.getOrDefault(i, 0) +1);
            }
        }
        return count;
    }
}