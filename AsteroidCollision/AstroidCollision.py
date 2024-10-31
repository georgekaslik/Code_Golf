class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []
        
        for asteroid in asteroids:
            # Flag to check if the current asteroid survives
            while stack and asteroid < 0 < stack[-1]:
                # Colliding condition
                if stack[-1] < -asteroid:
                    # Pop the smaller asteroid moving to the right
                    stack.pop()
                    continue
                elif stack[-1] == -asteroid:
                    # Both asteroids are the same size and destroy each other
                    stack.pop()
                break
            else:
                # If no collision, push the asteroid to the stack
                stack.append(asteroid)
        
        return stack