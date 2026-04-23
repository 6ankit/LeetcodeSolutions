class Solution {
    public boolean equalFrequency(String word) {
       
       StringBuilder temp = new StringBuilder();

       char[] ch = word.toCharArray();
       int[] alpha = new int[26];
       Set<Character> set = new HashSet<>();

       for(int i=0;i<ch.length;i++){
        if(!set.contains(ch[i])){
            temp.append(ch[i]);
        }
        set.add(ch[i]);
        alpha[ch[i]-'a']++;
       }


      for(int i=0;i<temp.length();i++){
        alpha[temp.charAt(i)-'a']--;
        int count =0;
        int flag=0;
        for(int j=0;j<26;j++){
            if(alpha[j]>0 && flag>0){
                if(alpha[j]!=flag){
                    count+=1;
                    break;
                }
            }else if(alpha[j]>0){
                flag=alpha[j];
            }
        }
        if(count==0) return true;
        alpha[temp.charAt(i)-'a']++;
      }
      return false;
    }

}