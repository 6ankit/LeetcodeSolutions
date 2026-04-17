class Solution {
    public int reverse(int n) {
        int mul = 1;
        int answer = 0;
        while (n > 0) {
            int rem = n % 10;
            answer = answer * mul;
            mul = 10;
            answer += rem;
            n /= 10;
        }
        return answer;
    }

    int lowerBound(List<Integer> list, int target) {
        int low = 0, high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int minMirrorPairDistance(int[] nums) {

        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.get(nums[i]).add(i);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                mp.put(nums[i], temp);
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp2 = mp.get(nums[i]);
            temp2.remove(Integer.valueOf(i));
            int val = reverse(nums[i]);
            if (mp.containsKey(val) && mp.get(val).size() > 0) {
                List<Integer> temp = mp.get(val);
                if (temp.get(temp.size() - 1) > i) {
                    int pos = lowerBound(temp,i);
                    int index = temp.get(pos);
                    answer = Math.min(Math.abs(i-index), answer);
                }
            }
        }
        // 11 
        if (answer == Integer.MAX_VALUE)
            return -1;
        return answer;
    }
}