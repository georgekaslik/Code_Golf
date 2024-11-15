# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        def dfs(node, current_sum):
            nonlocal count
            if not node:
                return
            current_sum += node.val
            if current_sum - targetSum in prefix_sums:
                count += prefix_sums[current_sum - targetSum]
            prefix_sums[current_sum] = prefix_sums.get(current_sum, 0) + 1
            dfs(node.left, current_sum)
            dfs(node.right, current_sum)
            prefix_sums[current_sum] -= 1
        
        count = 0
        prefix_sums = {0: 1}
        dfs(root, 0)
        return count