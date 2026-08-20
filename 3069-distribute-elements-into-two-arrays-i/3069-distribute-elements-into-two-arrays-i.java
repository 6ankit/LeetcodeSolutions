class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arr2=new ArrayList<Integer>();
        
        arr.add(nums[0]);
        arr2.add(nums[1]);

        int[] answer =new int[nums.length];
        
        if(nums.length%2==0){
            
            for(int i=2;i<nums.length;i++){
                if(arr.get(arr.size()-1)>=arr2.get(arr2.size()-1)){
                    arr.add(nums[i]);
                }else arr2.add(nums[i]);
            }
            // 1 2 14 15
            // 1 14 2 15
            int index=0;
            for(int i=0;i<arr.size();i++){
                answer[index]=arr.get(i);
                index+=1;
            }
            for(int i=0;i<arr2.size();i++){
                answer[index]=arr2.get(i);
                index+=1;
            }
            return answer;
        }


        for(int i=2;i<nums.length-1;i++){
           if(arr.get(arr.size()-1)>=arr2.get(arr2.size()-1)){
                arr.add(nums[i]);
            }else arr2.add(nums[i]);
        }

        if(arr.get(arr.size()-1)>=arr2.get(arr2.size()-1)){
            arr.add(nums[nums.length-1]);
        }else arr2.add(nums[nums.length-1]);
        int index=0;

        for(int i=0;i<arr.size();i++){
            answer[index]=arr.get(i);
            index+=1;
        }
        for(int i=0;i<arr2.size();i++){
            answer[index]=arr2.get(i);
            index+=1;
        }

        return answer;
    }
}