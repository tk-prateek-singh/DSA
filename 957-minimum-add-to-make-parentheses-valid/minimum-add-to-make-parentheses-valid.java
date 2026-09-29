class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(st.size()!=0 && st.peek()=='(' && s.charAt(i)==')'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        int count=0;
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
        
    }
}