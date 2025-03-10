/* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
//CODE:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> store=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(store.contains(nums[i])){
                return true;
            }else{
                store.add(nums[i]);
            }
        }
        return false;
    }
}//TC = SC = O(n)