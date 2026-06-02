class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        char[] ch = order.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (mp.containsKey(ch[i])) {
                while(mp.get(ch[i])>0)
                {
                ans.append(ch[i]);
                mp.put(ch[i], mp.get(ch[i]) - 1);
                }
            }
        }
        Iterator<Map.Entry<Character, Integer>> it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> m = it.next();
            int val = m.getValue();
            while (val > 0) {
                ans.append(m.getKey());
                val -= 1;
            }
        }
        return ans.toString();
    }
}