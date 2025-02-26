class Solution {
    public boolean isValid(String s) {

        //if there is only one bracket in the string s.
        if( s.length() == 1 )
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
            map.put(')','(');
            map.put('}','{');
            map.put(']','[');

        Stack<Character> mainStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){

                mainStack.push(s.charAt(i)); //push the open brackets onto the stack

            }

            else{

                if(mainStack.isEmpty() || map.get(s.charAt(i)) != mainStack.peek() ){
                    return false; //if the stack is empty OR when the peek of the stack does not match the key-value pair, return false
                }

                mainStack.pop(); // if not, you found a pair. Pop the already paired bracket out of stack.

            }

        }
    
        return mainStack.isEmpty(); // Finally, if the stack is completely empty, return true. Else return false
    
    }    
}