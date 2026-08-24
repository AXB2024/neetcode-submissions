class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int maxLen = 0;
        int maxFreq = 0;
        Map<Character, Integer> mp = new HashMap<>();

        while (r < s.length()) {
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq = Math.max(maxFreq, mp.get(s.charAt(r)));
            while ((r-l + 1) - maxFreq > k) {
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
        
    }
}
