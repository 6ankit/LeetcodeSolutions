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
        
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode a=lists[i];
            while(a!=null){
               arr.add(a.val);
               a=a.next;
            }
        }
        if(arr.size()<=0) return null;
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode temp=head;

        for(int i=1;i<arr.size();i++){
            ListNode h=new ListNode(arr.get(i));
            temp.next=h;
            temp=h;
        }

        return head;
    }
}