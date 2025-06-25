#This is a naive approach, it would not pass all test cases (It will exceed time limit)

class Solution(object):
    def wordBreak(self, s, wordDict):
        def canBreak(string):
            if string == "":
                return True

            for word in wordDict:
                if string.startswith(word):
                    rest = string[len(word):]
                    if canBreak(rest):
                        return True

            return False

        return canBreak(s)
