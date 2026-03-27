class Solution {
    public boolean areSimilar(int[][] mat, int x) {
        int[][] flag = new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                flag[i][j]=mat[i][j];
            }
        }

        while(x>0){
            for(int i=0;i<flag.length;i++){
                List<Integer> temp = new ArrayList<>();
                 for(int j=0;j<flag[i].length;j++){
                        temp.add(flag[i][j]);
                 }
                 if(i%2==0){
                    List<Integer> temp2 = new ArrayList<>();
                    for(int k=1;k<temp.size();k++){
                        temp2.add(temp.get(k));
                    }
                    temp2.add(temp.get(0));

                    for(int o=0;o<flag[i].length;o++){
                        flag[i][o]=temp2.get(o);
                    }
                 }
                 else{
                    List<Integer> temp2 = new ArrayList<>();
                     temp2.add(temp.get(temp.size()-1));
                    for(int o=0;o<temp.size()-1;o++){
                        temp2.add(temp.get(o));
                    }
                    for(int k=0;k<flag[i].length;k++){
                        flag[i][k]=temp2.get(k);
                    }
                 }
            }
            x-=1;
        }
        for(int i=0;i<flag.length;i++){
            for(int j=0;j<flag[i].length;j++){
                if(flag[i][j]!=mat[i][j]) return false;
            }
        }
        return true;
    }
}