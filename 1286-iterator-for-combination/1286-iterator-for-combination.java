class CombinationIterator {


    List<String> lexoStrings;
    int i=0;

    public void generate(String characters, int combinationLength,int index,StringBuilder p)
    {

       if(p.length()>=combinationLength){
            lexoStrings.add(p.toString());
            return;
       }
       if(index>=characters.length()) return;

       p.append(characters.charAt(index));
       generate(characters,combinationLength,index+1,p);
       p.deleteCharAt(p.length()-1);
       generate(characters,combinationLength,index+1,p);
    }

    public CombinationIterator(String characters, int combinationLength) {
        lexoStrings=new ArrayList<>();
        StringBuilder p= new StringBuilder();
        generate(characters,combinationLength,0,p);
        for(int i=0;i<lexoStrings.size();i++){
            System.out.print(lexoStrings.get(i)+" ");
        }
    }
    
    public String next() {
        if(i<lexoStrings.size()) 
        {
            String p=lexoStrings.get(i);
            i+=1;
            return p;
        }
       return "";
    }
    
    public boolean hasNext() {
        if(i>=lexoStrings.size()) return false;
      return true;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */