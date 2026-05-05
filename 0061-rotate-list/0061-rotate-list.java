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
    
    int Length(ListNode head)
    {
        int size=0;
        while(head!=null)
        {
            size+=1;
            head=head.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size=Length(temp);
        
        if(size==0) return head;
        if(size==k || size==1) return head;
        if(k==0) return head;
        k=k%size;
        if(size==k || size==1) return head;
        if(k==0) return head;
        int help = size-k;
        
        //if(size==0) return head;
        //if(size==k || size==1) return head
        
        ListNode temp2 = head;
        
        int i=1;
        while(i<help)
        {
            temp2=temp2.next;
            i+=1;
        }
        
        temp=temp2;
        temp2=temp.next;
        ListNode finalNode = temp2;
        
        while(finalNode.next!=null)
        {
           finalNode=finalNode.next;
        }
        temp.next=null;
        finalNode.next=head;
        
  
        return temp2;
    }
}