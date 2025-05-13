class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0)
            return 0;
        
        if(s.length() == 1)
            return 1;

        Set<Character> window = new HashSet<>();
        int start = 0, end = 0;
        int maxLength = 0;

        while (end < s.length()) {
            char c = s.charAt(end);

            while (window.contains(c)) {
                window.remove(s.charAt(start));
                start++;
            }

            window.add(c);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        return maxLength;
        
    }
}