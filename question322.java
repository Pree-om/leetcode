/* You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin. */

//CODE:
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++){
                if((i>=coins[j]) && (dp[i-coins[j]]!=-1)){
                    min = Math.min(min,dp[i-coins[j]]);
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }else{
                dp[i]=-1;
            }
        }
        return dp[amount];
    }
}//TC=O(n*m),SC=O(n)