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
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> arr  = new PriorityQueue<>();

        for(int i=0;i<lists.length;i++){
            ListNode a=lists[i];
            while(a!=null){
               arr.offer(a.val);
               a=a.next;
            }
        }
        if(arr.size()<=0) return null;
        ListNode head = new ListNode(arr.peek());
        ListNode temp=head;
        arr.poll();
        while(arr.size()>0){
            ListNode h=new ListNode(arr.peek());
            arr.poll();
            temp.next=h;
            temp=h;
        }

        return head;
    }
}