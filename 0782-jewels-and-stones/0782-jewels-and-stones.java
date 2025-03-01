class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int result = 0;

        for( int i = 0; i < stones.length(); i++){

            char j = stones.charAt(i);

            if(jewels.contains(Character.toString(j))){
                result = result + 1;
            }
        }

        return result;
        
    }
}