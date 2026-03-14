class Solution {
    List<String> happyStrings;
    public void generateAllHappyStrings(StringBuilder s,int n){
        if(s.length()>=n){
            int flag=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    flag+=1;
                    break;
                }
            }
            if(flag==0) happyStrings.add(s.toString());
            return;
        }
        s.append('a');
        generateAllHappyStrings(s,n);
        s.deleteCharAt(s.length()-1);
        s.append('b');
        generateAllHappyStrings(s,n);
        s.deleteCharAt(s.length()-1);
        s.append('c');
        generateAllHappyStrings(s,n);
        s.deleteCharAt(s.length()-1);
    }
    public String getHappyString(int n, int k) {
        happyStrings=new ArrayList<>();
        generateAllHappyStrings(new StringBuilder(),n);
        Collections.sort(happyStrings);
        if(k<=happyStrings.size()){
            return happyStrings.get(k-1);
        }
        return "";
    }
}