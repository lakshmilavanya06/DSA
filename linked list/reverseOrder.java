// Problem: middle node
// Link:https://leetcode.com/problems/reverse-linked-list/description/
// Topic: linked list
// Difficulty: easy
// Date Solved: 16-07-2025
//time complexity:O(n)
//time taken:12 mins
   
   /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class reverseOrder {
    public ListNode reverseOrdr(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode Temp = curr.next;
            curr.next = prev;              
            prev = curr;                  
            curr = Temp;             
        }

        return prev; 
    }
}

