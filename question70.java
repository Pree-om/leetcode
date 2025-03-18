/* You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? */
//CODE:
/* class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int[] dp=new int[n+1];
        //dp[0]=0; as it's default
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]; //it follows fibonacci pattern
        }
        return dp[n];
    }
}//TC=SC=O(n) */
//Better CODE:
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }
}//TC=SC=O(n)
//This problem is a fibonacci series problem. The number of ways to reach the ith step is the sum of the number of ways to reach the (i-1)th step and the number of ways to reach the (i-2)th step.