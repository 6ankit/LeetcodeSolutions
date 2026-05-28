/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { 
 *         this.val = val; 
 *         this.next = next; 
 *     }
 * }
 */

class Solution {

    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode temp = head;
        int carry = 0;

        while(temp != null){

            int val = temp.val * 2 + carry;

            temp.val = val % 10;

            carry = val / 10;

            if(temp.next == null && carry > 0){
                temp.next = new ListNode(carry);
                carry = 0;
                break;
            }

            temp = temp.next;
        }

        return reverse(head);
    }
}