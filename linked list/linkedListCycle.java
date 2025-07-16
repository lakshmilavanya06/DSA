// Problem: linked-list-cycle
// Link:https://leetcode.com/problems/linked-list-cycle/description/
// Topic: linked list
// Difficulty: easy
// Date Solved: 16-07-2025
//time complexity:O(n)
//time taken:15 mins
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        if(temp ==null || temp.next==null){
            return false;
        }
         ListNode s= head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;     

            if (s == f) return true; 
        }

        return false;
    }
}