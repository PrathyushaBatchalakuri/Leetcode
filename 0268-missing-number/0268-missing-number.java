class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);

        int value = 0;

        for( int i = 0; i < nums.length; i++){
            
            //value = nums[i];
            if( i != nums[i] ){
                return i;
            }

        }

        if(nums.length != nums[nums.length - 1])
            return nums.length;

        return 0;

    }
}