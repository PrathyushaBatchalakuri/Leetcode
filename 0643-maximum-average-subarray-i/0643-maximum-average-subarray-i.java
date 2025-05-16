class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int start = 0, end = 0;
        
        double sum = 0, avg = 0, maxAvg = Integer.MIN_VALUE;
        
        while(end < nums.length){
            sum = sum + nums[end];
            
            if( (end - start + 1) == k){
                
                avg = sum / k;
                
                if( maxAvg < avg){
                
                    maxAvg = avg;
                
            }
            
            sum = sum - nums[start];
            
            start = start + 1;
                
            }
            
            end = end + 1;
            
        }
        
        return maxAvg;
        
    }
}