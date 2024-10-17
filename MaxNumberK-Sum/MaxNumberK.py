class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        freq = {}
        count = 0
        for num in nums:
            complement = k - num
            if freq.get(complement, 0) > 0:
                count += 1
                freq[complement] -= 1
            else:
                freq[num] = freq.get(num, 0) + 1

        return count