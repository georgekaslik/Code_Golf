# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: TreeNode) -> int:
        if not root:
            return 0
        queue = deque([root])
        max_sum = float('-inf')
        max_level = 0
        current_level = 0
        
        while queue:
            current_level += 1
            level_sum = 0
            for _ in range(len(queue)):
                node = queue.popleft()
                level_sum += node.val
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            if level_sum > max_sum:
                max_sum = level_sum
                max_level = current_level
        
        return max_level