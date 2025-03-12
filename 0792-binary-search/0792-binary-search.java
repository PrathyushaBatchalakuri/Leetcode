class Solution {


    public int Bsearch(int[] nums, int target, int start, int end){

        if(start > end) return -1;

        int mid = start +(end - start)/2;

        if(nums[mid] == target) return mid;

        if(nums[mid] < target){

            return Bsearch(nums, target, mid + 1, end );

        }

        if(nums[mid] > target){

            return Bsearch(nums, target, start, mid - 1 );

        }

        return -1;

    }

    public int search(int[] nums, int target) {

        if( nums.length == 1 ){
            if(nums[0] == target) return 0;
            return -1;
        }
        
        int start = 0; int end = nums.length - 1;

        return Bsearch( nums, target, start, end );   
    }
}