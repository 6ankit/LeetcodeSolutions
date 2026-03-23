class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

      Stack<Integer> st = new Stack<>();
      st.push(temperatures.length-1);
      int[] temp = new int[temperatures.length];

      temp[temperatures.length-1]=-1;
      int i=temperatures.length-2;
    
      while(i>=0){

        while(st.size()>0 && temperatures[i]>=temperatures[st.peek()]){
            st.pop();
        }
        if(st.size()==0){
            temp[i]=-1;
        }
        else {
            temp[i]=st.peek();
        }
        st.push(i);
        i-=1;

      }
      for(int j=0;j<temp.length;j++){
        if(temp[j]==-1) temp[j]=0;
        else{
            temp[j]=temp[j]-j;
        }

      }
      return temp;
    } 
}