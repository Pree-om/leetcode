/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation. */
//CODE:
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix =new int[nums.length];
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            prefix[i]=prefix[i]*suffix;
            suffix=suffix*nums[i];
        }
        return prefix;
    }
}
//[1, 2, 3, 4], 
//[1, 1, 2, 6] -> prefix
//[24,12,4, 1] -> suffix
//[24,12,8, 6]
//Dynamic programming
//TC = SC = O(2n) -> O(n)