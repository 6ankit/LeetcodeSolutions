class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

         
        int first = rec1[0];
        int second = rec1[2];

        int third = rec2[0];
        int fourth = rec2[2];

        if(third>=second || first >= fourth){
            return false;
        }

        first = rec1[1];
        second = rec1[3];

        third = rec2[1];
        fourth = rec2[3];

        if(third>=second || first >= fourth){
            return false;
        }
        return true;

    }
}