'''Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.'''
#CODE:
class Solution(object):
    def myAtoi(self, s):
        s = s.strip()  
        if not s:
            return 0  
        
        store = 1  
        newStr = ""
        
        if s[0] == '-':
            store = -1
            s = s[1:]  
        elif s[0] == '+':
            s = s[1:]  

        for i in range(len(s)):
            if '0' <= s[i] <= '9':  
                newStr += s[i]
            else:
                break  
        
        if not newStr:  
            return 0
        
        result = int(newStr) * store  

        int_min, int_max = -2**31, 2**31 - 1
        if result < int_min:
            return int_min
        if result > int_max:
            return int_max
        
        return result