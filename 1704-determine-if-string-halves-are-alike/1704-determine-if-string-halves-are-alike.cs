public class Solution {

    public bool isVowel(char c){
        if(c=='a' || c=='A') return true;
        if(c=='e' || c=='E') return true;
        if(c=='i' || c=='I') return true;
        if(c=='o' || c=='O') return true;
        if(c=='U' || c=='u') return true;
        return false;
    }
    public bool HalvesAreAlike(string s) {
       int firstCount =0;
       for(int i=0;i<s.Length/2;i++){
            if(isVowel(s[i])){
                firstCount+=1;
            }
       }
       int secondCount=0;
       for(int i=s.Length/2;i<s.Length;i++){
        if(isVowel(s[i])){
            secondCount+=1;
        }
       }

       return firstCount==secondCount;
    }
}