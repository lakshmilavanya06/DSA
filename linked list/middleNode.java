// Problem: middle node
// Link:https://leetcode.com/problems/middle-of-the-linked-list/
// Topic: linked list
// Difficulty: easy
// Date Solved: 16-07-2025
//time complexity:O(n)
//time taken:2 mins

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
