class Solution {
    public int majorityElement(int[] nums) {

        //Voting Algorithm
        int majority = nums[0];

        int vote = 1;

        for(int i = 1; i < nums.length; i++){

            if(vote == 0){
                majority = nums[i];
                vote = vote + 1;
            } 
            else if(majority == nums[i]){
                vote = vote + 1;
            } 
            else{
                vote = vote - 1;
            }
            
        }

        return majority;
        
    }
}