class Solution(object):
    def mySqrt(self, x):
        low=0
        high=x
        while low<=high:
            mid=low+(high-low)//2
            square=mid*mid
        
            if square==x:
                return mid
            elif square<x:
                low=mid+1
            else:
                high=mid-1

        return high

        


        
