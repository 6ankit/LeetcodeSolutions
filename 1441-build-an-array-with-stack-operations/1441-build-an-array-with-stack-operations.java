class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();
        int i=0;
        for(int j=1;j<=n;j++){
            if(i>=target.length){
                break;
            }
            else if(target[i]!=j){
                answer.add("Push");
                answer.add("Pop");
            }
            else{
                i+=1;
                answer.add("Push");
            }
        }
        return answer;
    }
}