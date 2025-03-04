class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!freqMap.containsKey(c) || freqMap.get(c) == 0) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
        }

        return true;

        
    }
}