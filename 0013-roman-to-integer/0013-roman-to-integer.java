class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = roman.get(s.charAt(i));

            if (i < s.length() - 1 && current < roman.get(s.charAt(i + 1))) {
                sum -= current; // Subtract if current is less than the next
            } else {
                sum += current; // Otherwise, add the value
            }
        }

        return sum;
    }
}
