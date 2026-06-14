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
    public int pairSum(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        int maxi=Integer.MIN_VALUE;
        int i=0;
        int n=arr.size();
        while(i<n)
        {
            int sum=arr.get(i);
            int index=(n-1-i);
            if(index<n)
            {
                sum+=arr.get(index);
                maxi=Math.max(maxi,sum);
            }
            i+=1;
        }
        return maxi;
    }
}