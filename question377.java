class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<=target;i++){
            for(int num:nums){
                if(i>=num){
                    dp[i]+=dp[i-num];
                }
            }
        }
        return dp[target];
    }
}

/* 
let nums=[1,2,3], target = 4
dp table's length = target+1
  0   1   2   3   4
| 1 | 1 | 2 | 4 | 7 | = dp, since, it's bottom-up dp, ans=dp[4]=7
dp[0]=1, there's always 1 combination for 0, that's []
dp[1]:
    now, target=1
    transverse through each num in nums, nums[0]=1 -> 1-1=0
    so, dp[1]+=dp[0]
    now, nums[1]=2 -> 1-2=-1<0 skip
    now, nums[2]=3 -> 1-3=-2<0 skip
    thus, dp[1]=1
dp[2]:
    now, target=2
    transverse through each num in nums, nums[0]=1 -> 2-1=1
    so, dp[2]+=dp[1]
    now, nums[1]=2 -> 2-2=0 
    so, dp[2]+=(dp[1]+dp[0])
    now, nums[2]=3 -> 2-3=-1<0 skip
    thus, dp[2]=2
dp[3]:
    now, target=3
    transverse through each num in nums, nums[0]=1 -> 3-1=2
    so, dp[3]+=dp[2]
    now, nums[1]=2 -> 3-2=1
    so, dp[3]+=(dp[2]+dp[1])
    now, nums[2]=3 -> 3-3=0 
    so, dp[3]+=(dp[2]+dp[1]+dp[0])
    thus, dp[3]=4
dp[4]:
    now, target=4
    transverse through each num in nums, nums[0]=1 -> 4-1=3
    so, dp[4]+=dp[3]
    now, nums[1]=2 -> 4-2=2
    so, dp[4]+=(dp[3]+dp[2])
    now, nums[2]=3 -> 4-3=1
    so, dp[4]+=(dp[3]+dp[2]+dp[1])
    thus, dp[3]=7

This is bottom-up dp approach, solved using 1D tabulation method

TC:O(n*target), SC:O(target)
*/
