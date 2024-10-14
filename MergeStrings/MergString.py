class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        outStr = ""
        len1 = len(word1)
        len2 = len(word2)
        shortest = len1 if len1 < len2 else len2
        for i in range(shortest):
            outStr += word1[i] + word2[i]
        if len1 > len2:
            outStr += word1[shortest:]
        elif len2 > len1:
            outStr += word2[shortest:]
        return outStr