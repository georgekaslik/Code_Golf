class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        
        for char in s:
            if char == '*':
                if stack:  # Ensure the stack is not empty before popping
                    stack.pop()
            else:
                stack.append(char)
        
        return ''.join(stack)