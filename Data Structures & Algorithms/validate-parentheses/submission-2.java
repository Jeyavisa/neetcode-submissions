class Solution {
    public boolean isValid(String s) {
        Stack<Character> expected=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                expected.push(')');
            }else if(ch=='['){
                expected.push(']');
            }else if(ch=='{'){
                expected.push('}');
            }else {
                if(expected.isEmpty()){
                    return false;
                }
                char lastExpected=expected.pop();
                if(ch!=lastExpected){
                    return false;
                }
            }
        }
        return expected.isEmpty();
        
    }
}
