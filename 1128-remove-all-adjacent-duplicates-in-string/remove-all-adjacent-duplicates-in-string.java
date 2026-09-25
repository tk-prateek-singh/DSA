class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=n-1;i>=0;i--){
            if(st.size()!=0 && s.charAt(i)==st.peek()){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
    }
}