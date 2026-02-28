class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
               sb.append(s.charAt(i)); //str
               //j=i;
            }
            else{
                sb.reverse();
            }
            

            // if(s.charAt(i)=='i'){
            //     break;
            // }
        }
        // sb.reverse();
        // for(int k=j+1;k<s.length();k++){
        //   sb.append(s.charAt(k));
        // }
        return sb.toString();
    }
}