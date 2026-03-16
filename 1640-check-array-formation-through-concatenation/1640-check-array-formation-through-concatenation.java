class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<pieces.length;i++){
            if(pieces[i].length>1){
                int k=0;
                for(int j=0;j<arr.length;j++){
                    if(k<pieces[i].length){
                        if(pieces[i][k]==arr[j]){
                            if(!mp.containsKey(arr[j])) return false;
                            k+=1;
                            mp.put(arr[j],mp.get(arr[j])-1);
                            if(mp.get(arr[j])==0)mp.remove(arr[j]);
                        }
                        else k=0;
                    }
                }
                if(k!=pieces[i].length){
                    return false;
                }
            }
            else {
                int val=pieces[i][0];
                if(!mp.containsKey(val)) return false;
                mp.put(val,mp.get(val)-1);
                if(mp.get(val)==0) mp.remove(val);
            }
        }
        return true;
    }
}