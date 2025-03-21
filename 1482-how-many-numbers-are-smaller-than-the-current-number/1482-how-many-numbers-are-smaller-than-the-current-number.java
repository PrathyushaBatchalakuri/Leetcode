class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] temp = nums.clone();
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] array = new int[nums.length];

        for(int i = 0; i < temp.length; i++){

            if(!map.containsKey(temp[i])){
                map.put(temp[i], i);
            }
        }

        for(int i = 0; i < nums.length; i++)
            array[i] = map.get(nums[i]);

        return array;
        
    }
}