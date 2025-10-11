class Solution(object):
    def longestCommonSubsequence(self, text1, text2):
        """
        :type text1: str
        :type text2: str
        :rtype: int
        """
        rows = len(text1) + 1
        cols = len(text2) + 1

        dp = [[0 for i in range(cols)]for j in range(rows)]

        for i in range(1, rows):
            for j in range(1, cols):
                if text1[i-1] == text2[j-1]:
                    dp[i][j] = dp[i-1][j-1] + 1
                else:
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1])

        return dp[i][j]