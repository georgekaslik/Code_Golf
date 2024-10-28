class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        # Convert lists to sets to easily find unique elements
        set1, set2 = set(nums1), set(nums2)

        # Find elements unique to each set by using set difference
        unique_in_nums1 = list(set1 - set2)
        unique_in_nums2 = list(set2 - set1)

        # Return them as lists in the specified format
        return [unique_in_nums1, unique_in_nums2]