class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        Map<Integer,Integer> rank = new HashMap<>();
        int index=1;
        for(int i=0;i<temp.size();i++)
        {
           int value=temp.get(i);
           if(!rank.containsKey(value))
           {
             rank.put(value,index);
             index+=1;
           }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rank.get(arr[i]);
        }
        return arr;
    }
}