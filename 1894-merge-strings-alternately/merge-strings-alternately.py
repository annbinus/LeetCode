class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        length = 0
        if len(word1) < len(word2):
            length = len(word1)
        else:
            length = len(word2)
        
        res = ""

        for i in range(length):
            res = res + word1[i] + word2[i]

        if len(word1) < len(word2):
            res = res + word2[length:]
        else:
            res = res + word1[length:]

        return res