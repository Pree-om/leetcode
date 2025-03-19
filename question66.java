/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. */

//CODE:
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits;
            }
            digits[i] = 0; // If it's 9, set to 0 and continue
        }
        int[] result = new int[n + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result;
    }
}