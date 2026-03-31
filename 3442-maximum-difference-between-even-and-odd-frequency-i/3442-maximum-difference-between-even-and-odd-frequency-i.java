class Solution {
    public int maxDifference(String s) {
        int[] arr=new int[26];

        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            arr[ch[i]-'a']++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i]=-1;
        }

        List<Integer> first = new ArrayList<>();

        List<Integer> second = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                first.add(arr[i]);
            }
            else if(arr[i]%2!=0){
                second.add(arr[i]);
            }
        }
        Collections.sort(first);
        Collections.sort(second);

        int ans =Integer.MIN_VALUE;
        for(int i=second.size()-1;i>=0;i--){
            for(int j=first.size()-1;j>=0;j--){
                System.out.println(second.get(i)+" "+first.get(j));
                ans=Math.max(second.get(i)-first.get(j),ans);
            }
        }
        return ans;

    }
}