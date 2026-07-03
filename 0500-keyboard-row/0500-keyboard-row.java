class Solution {
    public String[] findWords(String[] words) {
        Set<Character> firstRow = Set.of(
                'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p','Q','W','E','R','T','Y','U','I','O','P');

        Set<Character> secondRow = Set.of(
                'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l','A','S','D','F','G','H','J','K','L');

        Set<Character> thirdRow = Set.of(
                'z', 'x', 'c', 'v', 'b', 'n', 'm','Z','X','C','V','B','N','M');

        List<String> answer = new ArrayList<>();
        System.out.println(thirdRow);

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;

            char[] ch = words[i].toCharArray();

            if (firstRow.contains(ch[0])) {
                for (int j = 1; j < ch.length; j++) {
                    if (!firstRow.contains(ch[j])) {
                        flag = false;
                        break;
                    }
                }
            } else if (secondRow.contains(ch[0])) {
                for (int j = 1; j < ch.length; j++) {
                    if (!secondRow.contains(ch[j])) {
                        flag = false;
                        break;
                    }
                }
            } else {
                for (int j = 1; j < ch.length; j++) {
                    if (!thirdRow.contains(ch[j])) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                answer.add(words[i]);
            }
        }

        return answer.toArray(new String[0]);
    }
}