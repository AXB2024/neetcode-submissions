class Solution:
    def isValid(self, s: str) -> bool:
        stack = []  # holds the opening brackets that haven't been closed yet
        mp = {')': '(', ']': '[', '}': '{'}  # pairs each closing bracket with its opening bracket

        for i in s:  
            if i in mp:  # i is a closing bracket, because only closers are keys in mp
                if stack and stack[-1] == mp[i]:  # stack isn't empty AND its top is the matching opener
                    stack.pop()  # take the matched opener off the stack 
                else:  # stack is empty, or the top opener is the wrong type
                    return False  
            else:  # i is an opening bracket: '(', '[', or '{'
                stack.append(i)  # put it on the stack until its closer shows up

        return not stack  # valid only if every opener got matched, leaving the stack empty




        