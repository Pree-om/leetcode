class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}//TC: O(m * n), SC:O(m * n)


/*text1="abc", text2="acd"
dp[][]= 
    ""  a   b   c
""  0   0   0   0

a   0   1   1   1

c   0   1   1   2

d   0   1   1   2 <- return 2 if "a"="a" or same, 1+previous diagonal vaiue, else , max of top or left,
It's bottom-up dp approach */
