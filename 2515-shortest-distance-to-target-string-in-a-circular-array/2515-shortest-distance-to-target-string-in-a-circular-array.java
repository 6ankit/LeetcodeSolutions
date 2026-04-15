class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        if(words[startIndex].equals(target)) return 0;
        int Mini = Integer.MAX_VALUE;

        int temp = startIndex+1;
        int flag=0;

        while(temp<words.length){
            flag+=1;
            if(words[temp].equals(target)){
                Mini=Math.min(flag,Mini);
            }
            if(temp==startIndex){
                break;
            }
            if(temp>=words.length-1){
                temp=0;
                continue;
            }
            temp+=1;
        }
        temp=startIndex-1;
        if(temp<0){
            temp=words.length-1;
        }

        flag=0;
        while(temp>=0){
            flag+=1;
            if(words[temp].equals(target)){
                Mini=Math.min(flag,Mini);
            }
            if(temp==startIndex){
                break;
            }
            if(temp<=0){
                temp=words.length-1;
                continue;
            }
            temp-=1;
        }
        if(Mini==Integer.MAX_VALUE){
            return -1;
        }
        return Mini;
    }
}