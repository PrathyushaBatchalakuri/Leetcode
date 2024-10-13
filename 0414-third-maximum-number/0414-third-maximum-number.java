class Solution {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> uniqueNums = new TreeSet<>();

        // Add each number in the array to the TreeSet
        for (int num : nums) {
            uniqueNums.add(num);
            // If the set grows larger than 3, remove the smallest element
            if (uniqueNums.size() > 3) {
                uniqueNums.pollFirst();
            }
        }
        
        // If the set has three or more elements, return the smallest in the set (third maximum)
        if (uniqueNums.size() == 3) {
            return uniqueNums.pollFirst();
        } else {
            // Return the last (largest) element in the set if there are less than 3 distinct numbers
            return uniqueNums.last();
        }
        
    }
}