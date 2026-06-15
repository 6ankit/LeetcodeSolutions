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
class Solution {

    int size(ListNode head){
        int size = 0;
        while(head!=null){
            size+=1;
            head=head.next;
        }
        return size;
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int n = size(temp);
        if(n==0 || n==1)
        {
            return null;
        }
        n/=2;
        temp = head;

        int t=0;
        while(t!=n-1){
            temp=temp.next;
            t+=1;
        }
        temp.next = temp.next.next;
        return head;
    }
}