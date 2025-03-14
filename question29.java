/* Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

 */

//CODE:
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;
        while (a >= b) {
            long temp = b, count = 1;
            while (a >= temp + temp) {
                temp += temp; // temp = temp * 2
                count += count; // count = count * 2
            }
            a -= temp;
            result += count;
        }
        return sign * result;
    }
}