class TextEditor {
    Stack<Character> left;
    Stack<Character> right;
    public TextEditor() {
        left=new Stack<>();
        right=new Stack<>();
    }
    
    public void addText(String text) {
        for(int i=0;i<text.length();i++) left.push(text.charAt(i));
    }
    
    public int deleteText(int k) {
        int count=0;
        while(k>0 && left.size()>0) {
            left.pop();
            count+=1;
            k-=1;
        }
        return count;
    }

    private String getLast10() {
    StringBuilder sb = new StringBuilder();
    Stack<Character> temp = new Stack<>();

    int count = 0;

    while(!left.isEmpty() && count < 10) {
        char c = left.pop();
        temp.push(c);
        count++;
    }

    while(!temp.isEmpty()) {
        char c = temp.pop();
        sb.append(c);
        left.push(c);
    }

    return sb.toString();
    }
    
    public String cursorLeft(int k) {
        while(k>0 && left.size()>0){
            char temp=left.peek();
            left.pop();
            right.push(temp);
            k-=1;
        }
        return getLast10();
    }
    
    public String cursorRight(int k) {
        while(k>0 && right.size()>0){
            char temp = right.peek();
            right.pop();
            left.push(temp);
            k-=1;
        }
        return getLast10();
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */