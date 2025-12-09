class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """
        nh, h = 0, -prices[0] - fee

        for i in range(1, len(prices)):
            nh = max(nh, h + prices[i])
            h = max(h, nh -prices[i] - fee)

        return nh