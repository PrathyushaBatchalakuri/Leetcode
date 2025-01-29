class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1)
            return false;
        
        Stack<Character> sc = new Stack<>();


        for( int i = 0; i < s.length(); i++ ){

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                
                sc.push(s.charAt(i));

            }

            else{

                if(sc.isEmpty())
                    return false;
                if(s.charAt(i) == ')' && sc.peek() != '(' ){
                    
                    return false;
                }
                
                else if(s.charAt(i) == '}' && sc.peek() != '{' ){
                    System.out.print("Hi");
                    
                    return false;
                }
                
                else if(s.charAt(i) == ']' && sc.peek() != '[' ){

                    System.out.print("Hi");
                    
                    return false;
                }
                else{
                    sc.pop();
                    continue;
                }
            }

        }

        if(!sc.isEmpty())
            return false;
        return true;
    }
}