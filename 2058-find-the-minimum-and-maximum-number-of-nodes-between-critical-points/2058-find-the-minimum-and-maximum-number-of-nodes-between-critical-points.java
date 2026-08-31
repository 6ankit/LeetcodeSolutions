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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
             int[] ans = new int[2];
             ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        //[6,8,4,1,9,6,6,10,6]
        //   2   
        
        List<Integer> points = new ArrayList<>();
        int lastValue = head.val;
        head=head.next;
        int i=2;
        while(head!=null){
            int currentValue = head.val;
            if(head.next!=null){
                int nextValue=head.next.val;
                if(currentValue>lastValue && currentValue>nextValue){
                    points.add(i);
                }else if(currentValue<lastValue && currentValue<nextValue){
                    points.add(i);
                }
                lastValue=currentValue;
            }
            i+=1;
            head=head.next;
        }
        System.out.println(points);
        int[] ans = new int[2];
        if(points.size()<=1){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        int lastElement=points.get(points.size()-1);
        ans[0]=Integer.MAX_VALUE;
        for(int j=0;j<points.size()-1;j++){
            ans[0]=Math.min(ans[0],points.get(j+1)-points.get(j));
        }
        ans[1]=lastElement-points.get(0);
        return ans;
    }
}