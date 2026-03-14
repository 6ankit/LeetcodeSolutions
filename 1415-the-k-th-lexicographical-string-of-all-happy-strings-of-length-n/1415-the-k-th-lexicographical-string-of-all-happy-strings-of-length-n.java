class Solution {
    List<String> happyStrings;

    public void generateAllHappyStrings(StringBuilder s, int n) {
        if (s.length() >= n) {
            happyStrings.add(s.toString());
            return;
        }
        if (s.length() == 0) {
            s.append('a');
            generateAllHappyStrings(s, n);
            s.deleteCharAt(s.length() - 1);
            s.append('b');
            generateAllHappyStrings(s, n);
            s.deleteCharAt(s.length() - 1);
            s.append('c');
            generateAllHappyStrings(s, n);
            s.deleteCharAt(s.length() - 1);
        } else {
            char ch = s.charAt(s.length() - 1);
            if (ch == 'a') {
                s.append('b');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
                s.append('c');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
            } else if (ch == 'b') {
                s.append('a');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
                s.append('c');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
            } else {
                s.append('a');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
                s.append('b');
                generateAllHappyStrings(s, n);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }

    public String getHappyString(int n, int k) {
        happyStrings = new ArrayList<>();
        generateAllHappyStrings(new StringBuilder(), n);
        if (k <= happyStrings.size()) {
            return happyStrings.get(k - 1);
        }
        return "";
    }
}