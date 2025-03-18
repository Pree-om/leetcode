'''Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).'''

#CODE:
class Solution(object):
    def reverse(self, x):
        if x <= -2**31 or x >= 2**31 - 1:  
            return 0
        sign = -1 if x < 0 else 1  
        x = int(str(abs(x))[::-1]) * sign 
        if x < -2**31 or x > 2**31 - 1:
            return 0
        
        return x