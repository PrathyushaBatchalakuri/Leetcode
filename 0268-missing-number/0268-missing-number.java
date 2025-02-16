class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int sumIndex = n * (n+1) / 2;

        int sumValue = Arrays.stream(nums).sum();

        int difference = -(sumValue - sumIndex);

        return (difference);

    }
}