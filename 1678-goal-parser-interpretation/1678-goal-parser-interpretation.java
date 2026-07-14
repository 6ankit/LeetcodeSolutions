/*
* author Ankit Lekharajani @6ankit
* @Param A string value named command
* @Result A string value representing the final result
*/
class Solution {
    public String interpret(String command) {
        
        StringBuilder answer = new StringBuilder();

        char[] ch = command.toCharArray();

        int i=0;
        while(i<ch.length){
            char c=ch[i];
            if(c=='G'){
                answer.append("G");
                i+=1;
            }else if(c=='('){
                if(ch[i+1]==')'){
                    answer.append("o");
                    i+=2;
                }
                else{
                answer.append("al");
                i+=4;
                }
            }
        }
        return answer.toString();
    }
}