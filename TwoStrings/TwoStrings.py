class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        if len(word1) == len(word2):
            set1, set2 = set(word1), set(word2)
            if set1 == set2:
                freq1 = Counter(word1)
                freq2 = Counter(word2)
                return sorted(freq1.values()) == sorted(freq2.values())

        return False