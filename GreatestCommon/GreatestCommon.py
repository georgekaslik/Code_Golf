class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        outStr = ""
        if str2 in str1:
            outStr = str1.replace(str2,"",1)
        return outStr