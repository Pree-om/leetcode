## Question: Given an integer x, return true if x is a palindrome, and false otherwise.
## CODE:
class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]
        