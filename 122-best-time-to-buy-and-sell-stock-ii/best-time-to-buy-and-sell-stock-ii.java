class Solution {
    public int maxProfit(int[] prices) {
        int left =0 , right = 1;
        int sum = 0;
        while (right < prices.length){
            if (prices[left] < prices[right])
                sum += prices[right] - prices[left];
            
            right++;
            left++;
        

        }
        return sum;
    }
}