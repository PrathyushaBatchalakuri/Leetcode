class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] temp = nums.clone();
        int[] result = new int[nums.length];


        Arrays.sort(temp);


        for(int i = 0; i < temp.length; i++){

            if( !map.containsKey(temp[i]) ){

                map.put(temp[i], i);

            }
  
        }

        for(int i = 0; i < nums.length; i++){

            result[i] = map.get(nums[i]);
        }

        

        return result;
        
    }
}