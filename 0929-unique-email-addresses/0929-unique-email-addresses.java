class Solution {
    public int numUniqueEmails(String[] emails) {
        for(int i=0;i<emails.length;i++){
            char[] ch = emails[i].toCharArray();
            int atTheRate=0;
            String p="";
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='.'){
                    if(atTheRate==0){
                        continue;
                    }
                    else {
                        p+=ch[j];
                        continue;
                    }
                }
                if(ch[j]=='@') atTheRate+=1;
                p+=ch[j];
            }
            if(p.length()>0) emails[i]=p;
            int plus=0;
            int index=0;
            String x="";
            p=emails[i];
            int o=0;
            int rate=0;
            while(o<p.length()){
                if(p.charAt(o)=='+' && rate==0){
                    while(o<p.length() && rate==0){
                        if(p.charAt(o)=='@'){
                            x+='@';
                            rate+=1;
                        }
                        o+=1;
                    }
                }
                else{
                    if(p.charAt(o)=='@')rate+=1;
                    x+=p.charAt(o);
                    o+=1;
                }
            }
            if(x.length()>0) emails[i]=x;
        }
        Map<String,Integer> mp=new HashMap<>();
        for(int i=0;i<emails.length;i++){
            mp.put(emails[i],mp.getOrDefault(emails[i],0)+1);
        }
        return mp.size();
    }
}