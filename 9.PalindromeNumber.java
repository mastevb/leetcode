/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/
class Solution {
    public boolean isPalindrome(int x) {
    	if(x < 0) {
    		return false;
    	}
		Queue<Integer> q = new LinkedList<Integer>();
        int hold = x;
        while (x != 0) {
        	q.add(x % 10);
        	x = x / 10;
        }
        int rev = 0;
        while(!q.isEmpty()) {
        	rev = rev * 10 + q.remove();
        }
        return hold == rev;
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
        	return false;
        }
        int div = 1;
        while(x / div >= 10) {
        	div = div * 10;
        }
        while(x > 0) { // larger than 0, not 10, because of cases like 1000021, when we need to compare 0 and 2.
        	int left = x / div;
        	int right = x % 10;
        	if (left != right) {
        		return false;
        	}
        	x = (x % div) / 10;
            div = div / 100;
        }
        return true;
    }
}