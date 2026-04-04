class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols = encodedText.length() / rows;
        char[][] diagonal = new char[rows][cols];

        char[] ch = encodedText.toCharArray();
        int r = 0;
        int c = 0;
        for (int i = 0; i < ch.length; i++) {
            diagonal[r][c] = ch[i];
            c += 1;
            if (c >= cols) {
                c = 0;
                r += 1;
                if (r >= rows)
                    break;
            }
        }
        r = 0;
        c = 0;
        int realCols = 0;
        int realRows = 0;
        StringBuilder answer = new StringBuilder();
        for (int startCol = 0; startCol < cols; startCol++) {
             r = 0;
             c = startCol;

            while (r < rows && c < cols) {
                answer.append(diagonal[r][c]);
                r++;
                c++;
            }
        }
        int letter=0;
        StringBuilder answer2 = new StringBuilder();
        for(int i=answer.length()-1;i>=0;i--){
            if(letter>0){
               answer2.append(answer.charAt(i));
            }
            else if(answer.charAt(i)!=' '){
                answer2.append(answer.charAt(i));
                letter+=1;
            }
        }
        return answer2.reverse().toString();
    }
}