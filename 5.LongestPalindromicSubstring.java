/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
        	return s;
        }
        String result = "";
        int max = 0;
        boolean[] dp = new boolean[s.length()][s.length()];
        for(int i = 0; i < s.length(); i++) {
        	for(int j = 0; j <= i; j++) {
        		dp[j][i] = (s.charAt(i) == s.charAt(j)) && (i - j <= 2 || dp[j + 1][i - 1]);
        		if (do[i][j]) {
        			if (j - i + 1 > max) {
        				max = j - i + 1;
        				result = s.substring(i, j + 1);
        			}
        		}
        	}
        }
        return result;
    }
}

class Solution {
    public String longestPalindrome(String s) {
        
    }
}