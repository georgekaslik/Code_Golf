class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        print(nums)

        n = len(nums)
        answer = [1] * n

        prefix = 1
        for i in range(n):
            answer[i] = prefix
            prefix *= nums[i]

        Multiplier = 1
        for i in range(n-1, -1, -1):
            answer[i] *= Multiplier
            Multiplier *= nums[i] 

        return answer