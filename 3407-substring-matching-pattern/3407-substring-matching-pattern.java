/*
* author Ankit Lekharajani 6ankit
* @Param Two values which are in the form of string
* @Return A boolean value which can be false or true
*/

class Solution {
    public boolean hasMatch(String s, String p) {

        String start = "";
        String end = "";

        int i = 0;

        while (p.charAt(i) != '*') {
            start += p.charAt(i);
            i++;
        }

        i++;

        while (i < p.length()) {
            end += p.charAt(i);
            i++;
        }

        int ans = 0;
        int ans2 = 0;

        i = 0;

        if (start.length() == 0 && end.length() == 0)
            return true;

        if (start.length() > 0) {
            while (i < s.length()) {
                if (s.charAt(i) == start.charAt(0)) {
                    if (i + start.length() <= s.length()) {
                        String k = s.substring(i, i + start.length());
                        if (k.equals(start)) {
                            ans++;
                            i += start.length();
                            break;
                        }
                    }
                }
                i++;
            }
        }

        if (end.length() > 0) {
            while (i < s.length()) {
                if (s.charAt(i) == end.charAt(0)) {
                    if (i + end.length() <= s.length()) {
                        String k = s.substring(i, i + end.length());
                        if (k.equals(end)) {
                            ans2++;
                            break;
                        }
                    }
                }
                i++;
            }
        }

        if (start.length() == 0 && ans2 == 1)
            return true;

        if (end.length() == 0 && ans == 1)
            return true;

        if (ans == 1 && ans2 == 1)
            return true;

        return false;
    }
}