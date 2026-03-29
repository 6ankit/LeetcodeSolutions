class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
       char[] ch = s1.toCharArray();
       char temp=ch[0];
       ch[0]=ch[2];
       ch[2]=temp;
       if(new String(ch).equals(s2)) return true;
       temp=ch[1];
       ch[1]=ch[3];
       ch[3]=temp;
       if(new String(ch).equals(s2)) return true;

       ch=s1.toCharArray();
       temp=ch[1];
       ch[1]=ch[3];
       ch[3]=temp;
       if(new String(ch).equals(s2)) return true;

    //    kina kinax
       return false;

    }
}