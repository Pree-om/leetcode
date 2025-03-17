/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. */

//CODE(HashSet):
/* class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            set.add(i);
        }
        for (int j = 0; j < nums.length; j++) {
            set.remove(nums[j]);
        }// Remove numbers that are present in nums
        for (int i = 0; i <= nums.length; i++) {
            if (set.contains(i)) { 
                return i;  
            }
        }// The remaining element in the set is the missing number

        return -1;  
    }
}//TCO(n),SC=O(n) */

//CODE(XOR):
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}//TC=O(n),SC=O(1)