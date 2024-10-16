class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        i = 0
        ii = 0
        while i < len(nums) and ii < len(nums):
            ii += 1
            if nums[i] == 0:
                del nums[i]
                nums.append(0)
            else:
                i+=1
                ii = i