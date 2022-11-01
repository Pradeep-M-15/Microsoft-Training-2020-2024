class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int curr=0;
        int max=0;
        HashSet<Character> hs = new HashSet();
        while(curr<s.length()){
            if(!hs.contains(s.charAt(curr))){
                hs.add(s.charAt(curr));
                curr++;
                max=Math.max(hs.size(),max);
            }
            else{
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
