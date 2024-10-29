class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = {}
        for num in arr:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1
        occurrences = []
        for value in count.values():
            if value in occurrences:
                return False
            occurrences.append(value)

        return True