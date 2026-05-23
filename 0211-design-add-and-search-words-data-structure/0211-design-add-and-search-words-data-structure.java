class WordDictionary {

    List<String> arr;
    public WordDictionary() {
        arr=new ArrayList<>();
    }
    
    public void addWord(String word) {
        arr.add(word);
    }
    
    public boolean search(String word) {
        for(int i=0;i<arr.size();i++){
            String p = arr.get(i);

           if(word.length()==p.length()){
            boolean flag = true;
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)!=word.charAt(j) && word.charAt(j)!='.'){
                    flag=false;
                    break;
                }
            }
            if(flag==true) return true;
           }
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */