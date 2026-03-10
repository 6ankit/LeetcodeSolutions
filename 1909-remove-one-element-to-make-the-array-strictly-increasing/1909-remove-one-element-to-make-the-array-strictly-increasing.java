class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int i=0;
        int j=1;
        int flag=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]>=nums[j]){
                flag+=1;
                break;
            }
            i+=1;
            j+=1;
        }

        if(flag==0) return true;

        List<Integer> help = new ArrayList<>();
        for(int c=0;c<nums.length;c++){
            if(c!=i) help.add(nums[c]);
        }
        flag=0;
        // 105 32 968
        for(int c=0;c<help.size()-1;c++){
            if(help.get(c)>=help.get(c+1)){
                flag+=1;
                break;
            }
        }

        if(flag==0) return true;
        List<Integer>help2 = new ArrayList<>();
         for(int c=0;c<nums.length;c++){
            if(c!=j) help2.add(nums[c]);
        }
        flag=0;
        for(int c=0;c<help2.size()-1;c++){
            if(help2.get(c)>=help2.get(c+1)){
                flag+=1;
                break;
            }
        }
        return flag==0;
    }
}