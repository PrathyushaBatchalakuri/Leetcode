class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int result = 0;

        for(int i = 1; i < points.length; i++){

            int dx = Math.abs(points[i][0] - points[i-1][0]);
            int dy = Math.abs(points[i][1] - points[i-1][1]);

            result = result + Math.max(dx,dy);

        }

        return result; 
        
    }
}