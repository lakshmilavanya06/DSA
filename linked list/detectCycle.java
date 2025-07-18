// Problem: linked-list-cycle-ii
// Link:https://leetcode.com/problems/linked-list-cycle-ii/
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
public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            System.out.println("no cycle");
        }
        ListNode s=head;
        ListNode f=head;
         while (f!= null && f.next != null) {
            s= s.next;
            f = f.next.next;

            if (s== f) { 
                ListNode entry = head;
                while (entry != s) {
                    entry = entry.next;
                    s= s.next;
                }
                return entry; 
            }
        }

        return null;
    }
}