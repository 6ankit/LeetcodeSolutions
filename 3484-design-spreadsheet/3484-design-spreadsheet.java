class Spreadsheet {

    int[][] arr;
    Set<Character> st;
    public Spreadsheet(int rows) {
        arr=new int[rows][26];
        st=new HashSet<>();
        String alphas="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<alphas.length();i++){
            st.add(alphas.charAt(i));
        }
    }
    
    public void setCell(String cell, int value) {
        char ch=cell.charAt(0);
        String p=cell.substring(1,cell.length());
        int row=Integer.parseInt(p);
        int col=ch-'A';
        arr[row-1][col]=value;
    }
    
    public void resetCell(String cell) {
        char ch=cell.charAt(0);
        String p=cell.substring(1,cell.length());
        int row=Integer.parseInt(p);
        int col=ch-'A';
        arr[row-1][col]=0;
    }
    
    public int getValue(String formula) {
      String p ="";
      int i=1;
      while(i<formula.length() && (formula.charAt(i)!='-' && formula.charAt(i)!='+' && formula.charAt(i)!='/' && formula.charAt(i)!='*')){
            p+=formula.charAt(i);
            i+=1;
      }
      String z="";
      char operation=formula.charAt(i);
      i+=1;
      while(i<formula.length()){
        z+=formula.charAt(i);
        i+=1;
      }
      int firstValue=0;
      if(st.contains(p.charAt(0))){
        char ch=p.charAt(0);
        String x=p.substring(1,p.length());
        int row=Integer.parseInt(x);
        int col=ch-'A';
        firstValue=arr[row-1][col];
      }
      else {
        firstValue=Integer.parseInt(p);
      }
      int secondValue=0;
      if(st.contains(z.charAt(0))){
        char ch=z.charAt(0);
        String x=z.substring(1,z.length());
        int row=Integer.parseInt(x);
        int col=ch-'A';
        secondValue=arr[row-1][col];
      }
      else {
        secondValue=Integer.parseInt(z);
      }
    
     return firstValue+secondValue;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */