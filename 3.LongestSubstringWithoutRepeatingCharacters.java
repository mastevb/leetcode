/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
    	Map <Character, Integer> map = new HashMap<Character, Integer>();
    	int result = 0;
    	for (int i = 0, j = 0; j < s.length(); j++) {
    		if (map.containsKey(s.charAt(j))) {
    			i = Math.max(i, map.get(s.charAt(j)));
    		}
    		result = Math.max(result, j - i + 1);
    		map.put(s.charAt(j), j + 1);
    	}
        return result;
    }
}
            
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int max = 0;
        int lower = 0;
        int higher = 0;
        int position = 0;
        Map <Character, Integer> map = new HashMap<Character, Integer>();
        while (higher < s.length()) {
        	if (map.containsKey(s.charAt(higher))) {
        		map.clear();
                max = Math.max(max, count);
        		count = 0;
                position++;
                higher = position;
        		lower = higher;
        	} else {
        		map.put(s.charAt(higher), 1);
        		higher++;
        		count = higher - lower;
        	}
        }
        return Math.max(count, max);
    }
}
