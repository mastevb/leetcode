/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    public int reverse(int x) {
    	int result = 0;
        while(x != 0) {
        	int value = x % 10;
        	x = x / 10;
        	if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && value > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && value < -8)) return 0;
            result = result * 10 + value;
        }
        return result;
    }
}