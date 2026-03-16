class Solution {
    List<String> binaryStrings;
    public void generateBinaryStrings(StringBuilder s,int n){
        if(s.length()>=n){
             binaryStrings.add(s.toString());
             return;
        }
        s.append('0');
        generateBinaryStrings(s,n);
        s.deleteCharAt(s.length()-1);
        s.append('1');
        generateBinaryStrings(s,n);
        s.deleteCharAt(s.length()-1);
    }
    public List<String> validStrings(int n) {
        binaryStrings=new ArrayList<>();
        if(n==1){
            List<String> ans= List.of("1","0");
            return ans;
        }
        generateBinaryStrings(new StringBuilder(),n);
        List<String> ans = new ArrayList<>();
        for(int i=0;i<binaryStrings.size();i++){
                String temp =binaryStrings.get(i);
                boolean flag=true;
                for(int j=0;j<temp.length()-1;j++){
                    if(temp.charAt(j)=='0' && temp.charAt(j+1)=='0'){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    ans.add(temp);
                }
        }
        return ans;
    }
}