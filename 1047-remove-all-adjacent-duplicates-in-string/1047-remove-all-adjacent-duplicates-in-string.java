class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String ans="";
        while (!stack.empty()){
            ans=stack.pop()+ans;
        }
        return ans;
    }
}