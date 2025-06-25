class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        Set<String> set = new HashSet<>(wordDict); //m
        for(int i=1;i<=s.length();i++){ //n
            for(int j=0;j<i;j++){ //n
                String word = s.substring(j,i); //n
                if(set.contains(word)&&dp[j]==true){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

/* 
Input: s = "leetcode", wordDict = ["leet","code"]
  0   1   2   3   4   5   6   7   8   
| T | F | F | F | T | F | F | F | T |=dp, being a bootom-up appraoch, if the last index(8) is T, it's T
      l   e   e   t   c   o   d   e
for i=1:
    l isn't present in wordDict, F
for i=2;
    le isn't present in wordDict, F
    e isn't present in wordDict, F
for i=3:
    lee isn't present in wordDict, F
    ee isn't present in wordDict, F
    e isn't present in wordDict, F
for i=4:
    leet is present in wordDict, so, now, is the starting of word(l from leet)'s prevoius index T, of so, i=4: T
    break
for i=5:
    leetc isn't present in wordDict, F
    eetc isn't present in wordDict, F
    etc isn't present in wordDict, F
    tc isn't present in wordDict, F
    c isn't present in wordDict, F
for i=6:
    leetco isn't present in wordDict, F
    eetco isn't present in wordDict, F
    etco isn't present in wordDict, F
    tco isn't present in wordDict, F
    co isn't present in wordDict, F
    o isn't present in wordDict, F
for i=7:
    leetcod isn't present in wordDict, F
    eetcod isn't present in wordDict, F
    etcod isn't present in wordDict, F
    tcod isn't present in wordDict, F
    cod isn't present in wordDict, F
    od isn't present in wordDict, F
    d isn't present in wordDict, F
for i=8:
    leetcode isn't present in wordDict, F
    eetcode isn't present in wordDict, F
    etcode isn't present in wordDict, F
    tcode isn't present in wordDict, F
    code is present in wordDict, so, now, is the starting of word(c from code)'s prevoius index T, of so, i=8: T
this is a bottom-up dp approach
TC: O(n^3+m), SC: O(n+m)
*/
