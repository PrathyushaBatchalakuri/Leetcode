class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> aSet = new HashSet<>();

        for( int item : nums){

            if(aSet.contains(item)){
                return true;
            }

            aSet.add(item);

        }

        return false;
        
    }
}