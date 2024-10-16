class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        i = 0
        while i < len(nums):
            if nums[i] == 0:
                del nums[i]
                nums.append(0)
            i+=1
            
        """
        Do not return anything, modify nums in-place instead.
        """
        