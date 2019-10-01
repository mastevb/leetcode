/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their 
nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur3 = result;
        int carry = 0;
        while(cur1 != null || cur2 != null) {
        	int x = 0;
        	int y = 0;
        	if (cur1 != null) {
        		x = cur1.val;
        	}
        	if (cur2 != null) {
        		y = cur2.val;
        	}
        	int sum = x + y + carry;
        	carry = sum / 10;
        	sum = sum % 10;
        	cur3.next = new ListNode(sum);
        	cur3 = cur3.next;
        	if (cur1 != null) {
        		cur1 = cur1.next;
        	}
        	if (cur2 != null) {
        		cur2 = cur2.next;
        	}
        }
        if (carry != 0) {
        	cur3.next = new ListNode(carry);
        }
        return result.next;
    }
}