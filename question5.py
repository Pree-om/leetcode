'''Given a string s, return the longest palindromic substring in s.'''
#CODE:
class Solution(object):
    def isPall(self, s):
        return s == s[::-1]  

    def longestPalindrome(self, s):
        l = 0
        max_pal = s[0]  

        while l < len(s):
            r = len(s) - 1  

            while r >= l:
                if s[l] == s[r]: 
                    if self.isPall(s[l:r+1]):  
                        if len(s[l:r+1]) > len(max_pal): 
                            max_pal = s[l:r+1]
                r -= 1  

            l += 1  

        return max_pal  