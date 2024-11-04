class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase(); // converting all to lower cases

        String newS = "";

        for(int i = 0; i <= s.length() - 1; i++) { // adding only alphanumeric to a new string

            char element = s.charAt(i);

            if( Character.isLetterOrDigit(element) ){

                newS = newS + element;
            }
        }

        String reverseS = new StringBuilder(newS).reverse().toString();

        if(reverseS.equals(newS))
            return true;
        

        System.out.print(newS+" ");

        System.out.print(reverseS);

        return false;
        
    }
}