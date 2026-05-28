from collections import Counter
class Solution(object):
    def isAnagram(self, s, t):
        if len(s)!=len(t): 
            return False
        sc=Counter(s)
        tc=Counter(t)
        return sc==tc
        
        