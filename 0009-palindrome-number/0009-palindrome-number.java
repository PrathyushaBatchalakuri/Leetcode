class Solution {

    public int helperFunction(int x, int result){

        if( x == 0)
            return result;
        
        int rem = x%10;
        result = result * 10 + rem;

        return helperFunction( x/10, result);
    }

    public boolean isPalindrome(int x) {

        if( x < 0 ) return false;

        int result = helperFunction(x,0);

        if( x == result)
            return true;
        return false;
    }
}