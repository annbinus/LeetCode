class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        
        for i in range(len(flowerbed)):
            prev = i == 0 or flowerbed[i-1] == 0
            fut = i == len(flowerbed) - 1 or flowerbed[i+1] == 0
            if prev and fut and flowerbed[i] == 0:
                n -= 1
                flowerbed[i] = 1 

        return n <= 0
