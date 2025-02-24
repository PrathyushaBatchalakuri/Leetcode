class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> maps = new HashMap<>();

        int maxCount = nums.length / 2;

        for( int digit : nums ){

            if(maps.containsKey(digit)){
                maps.put(digit, maps.get(digit) + 1);
            }
            else{
                maps.put(digit, 1);
            }

            if(maxCount < maps.get(digit)){

                return digit;

            }

        }

        return 0;
        
    }
}