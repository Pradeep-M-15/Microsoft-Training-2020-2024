class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int[] end = new int[256];
        for (int i = 0; i < 256; i++) {
            end[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (end[c] >= start) {
                start = end[c] + 1;
            }
            end[c] = i;
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
