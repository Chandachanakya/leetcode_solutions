class Solution(object):
    def numOfStrings(self, patterns, word):
        count=0
        for i in range(len(patterns)):
            if patterns[i] in word:
                count+=1
            else:
                i+=1
        return count

