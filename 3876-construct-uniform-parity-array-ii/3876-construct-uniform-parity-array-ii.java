class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int smallestOdd = Integer.MAX_VALUE;
        int smallestEven = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            int val = nums1[i];
            if(val%2!=0){
                smallestOdd = Math.min(smallestOdd,val);
            }
            else smallestEven=Math.min(smallestEven,val);
        }
        
        int[] temp=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int val = nums1[i];
            if(val%2!=0){
                temp[i]=val;
            }else{
                temp[i]=val-smallestOdd;
            }
        }
        boolean flag = true;
        for(int i=0;i<temp.length;i++){
            if(temp[i]%2==0 || temp[i]<=0){
                flag=false;
                break;
            }
        }
        if(flag) return true;

        flag=true;
        temp=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
            int val = nums1[i];
            if(val%2==0){
                temp[i]=val;
            }else{
                temp[i]=val-smallestEven;
            }
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i]%2!=0 || temp[i]<=0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}