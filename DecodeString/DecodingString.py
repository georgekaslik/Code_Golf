class Solution:
    def decodeString(self, s: str) -> str:
        count_stack = []
        string_stack = []
        current_string = ""
        current_count = 0
        
        for char in s:
            if char.isdigit():
                current_count = current_count * 10 + int(char)
            elif char == '[':
                count_stack.append(current_count)
                string_stack.append(current_string)
                current_string = ""
                current_count = 0
            elif char == ']':
                repeat_count = count_stack.pop()
                last_string = string_stack.pop()
                current_string = last_string + current_string * repeat_count
            else:
                current_string += char